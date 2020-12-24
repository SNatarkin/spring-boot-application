package springbootapp.dao;

import org.springframework.stereotype.Repository;
import springbootapp.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("student-v1")
public class StudentDataAccesService implements StudentDao {

    private static  List<Student> studentDB = new ArrayList<>();

    @Override
    public int addStudent(Student student) {
        studentDB.add(new Student(UUID.randomUUID(), student.getStudentName()));
        return 1;
    }

    @Override
    public int deleteStudentById(UUID id) {
        Optional<Student> studentDel = selectPersonByID(id);
        if(studentDel.isEmpty()){
            return  0;
        }
       studentDB.remove(studentDel.get());
        return 1;
    }

    @Override
    public int updateStudentById(UUID id, Student update) {
        return selectPersonByID(id).map(person -> {
            int indexOfPersonToUpdate = studentDB.indexOf(person);
            if(indexOfPersonToUpdate >= 0){
                studentDB.set(indexOfPersonToUpdate, new Student(id, update.getStudentName()));
                return 1;
            }
            return 0;
        } ).orElse(0);
    }

    @Override
    public List<Student> selectAllStudents() {
        return studentDB;
    }

    @Override
    public Optional<Student> selectPersonByID(UUID id) {
        return studentDB.stream().filter(student -> student.getId().equals(id)).findFirst();
    }


}
