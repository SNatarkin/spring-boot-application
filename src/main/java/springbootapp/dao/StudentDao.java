package springbootapp.dao;

import springbootapp.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentDao {

    /**
     * This is the method that will add the student to the list
     *
     * @param student
     * @return 1
     */
    int addStudent(Student student);

    /**
     * This method removes the student by id in the list
     *
     * @param id
     * @return 0 if the list is empty, 1 if update was successful
     */

    int deleteStudentById(UUID id);

    /**
     * This method updates the student name by id
     * @param id
     * @param update
     * @return 0 if update failed, 1 if update was successful
     */

    int updateStudentById(UUID id, Student update);

    /**
     * This method gives a complete list of students.
     *
     * @return list of students
     */
    List<Student> selectAllStudents();

    /**
     * This method returns the Student. Also checks for empty value
     * @param id
     * @return Student
     */
    Optional<Student> selectPersonByID(UUID id);

}
