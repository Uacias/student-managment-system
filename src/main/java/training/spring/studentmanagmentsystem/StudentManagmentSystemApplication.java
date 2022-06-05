package training.spring.studentmanagmentsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import training.spring.studentmanagmentsystem.entity.Student;
import training.spring.studentmanagmentsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		studentRepository.save(new Student("Krzysztof", "Grzegorczyk", "KG@gmail.com"));
//		studentRepository.save(new Student("Jan", "Janowicz", "JJ@gmail.com"));
//		studentRepository.save(new Student("Kamila", "Kronenberg", "KK@gmail.com"));

	}
}
