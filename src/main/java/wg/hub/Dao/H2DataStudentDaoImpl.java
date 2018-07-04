package wg.hub.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import wg.hub.Entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("h2Data")
public class H2DataStudentDaoImpl implements StudentDao {

    @Autowired
    StudentRepository repo;

    @Override
    public Collection<Student> getAllStudents() {
        Collection<Student> target = new ArrayList<Student>();
        repo.findAll().forEach(target::add);
        return target;
    }

    @Override
    public Student getStudentById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteStudentById(int id) {
        repo.deleteById(id);
    }

    @Override
    public void updateStudent(Student student){
        Student st = getStudentById(student.getStudentId());
        repo.save(student);
    }

    @Override
    public void insertStudent(Student student) {
        repo.save(student);
    }
}
