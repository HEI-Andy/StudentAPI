package school.hei.studentapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/")
    public String helloThere(){
        return "Welcome!";
    }
}
