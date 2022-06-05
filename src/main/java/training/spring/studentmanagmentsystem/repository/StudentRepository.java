package training.spring.studentmanagmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import training.spring.studentmanagmentsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
