package school.hei.studentapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.studentapi.models.Students;

public interface StudentRepoJpa extends JpaRepository<Students, Long> {
}
