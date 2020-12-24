package springbootapp.api;

import org.springframework.web.bind.annotation.*;
import springbootapp.model.Student;
import springbootapp.service.StudentService;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("api/person")
@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;

    }

    @PostMapping
    public void addStudent(@Valid @RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> selectAllStudent() {
        return studentService.getAllStudents();
    }
}
