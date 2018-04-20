package wg.hub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import wg.hub.Dao.StudentDao;
import wg.hub.Entity.Student;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mysql")
    private StudentDao studentDao;


    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        studentDao.deleteStudentById(id);
    }

    public void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
