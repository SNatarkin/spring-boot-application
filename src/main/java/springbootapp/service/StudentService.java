package springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import springbootapp.dao.StudentDao;
import springbootapp.model.Student;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private final StudentDao studentDao;


    public StudentService(@Qualifier("student-v1") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }
}
