package school.hei.studentapi.controller;


import org.springframework.web.bind.annotation.*;
import school.hei.studentapi.models.Students;
import school.hei.studentapi.repo.StudentRepo;

import java.util.List;
import java.util.Optional;

public class StudentController {
    private StudentRepo repository ;

    @GetMapping("/students")
    public List<Students> findAll(){
        return repository.findAll() ;
    }

    @GetMapping("/students/search")
    public List<Students> findWhereNameLike(@RequestParam(name = "q", required = true) String query){
        return repository.findWhereNameLike(query);
    }

    @PostMapping("/students")
    public Students addStudent(Students student){
        return repository.add(student);
    }

    @PatchMapping("/students")
    public Students updateNameByID(@RequestParam("id") Long id, @RequestParam("name") String newName){
        return  repository.updateNameById(id , newName) ;
    }

    @DeleteMapping("/students/{id_student}")
    public String deleteStudents(@PathVariable Long id_student){
        return repository.deleteById(id_student);
    }
}
