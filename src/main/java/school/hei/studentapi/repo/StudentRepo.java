package school.hei.studentapi.repo;

import school.hei.studentapi.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepo {

    List<Students> findAll();

    List<Students> findWhereNameLike(String query);

    Students add(Students student);

    Students updateNameById(Long id, String newName);

    String deleteById(Long id_student);
}
