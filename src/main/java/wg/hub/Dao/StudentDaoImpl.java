package wg.hub.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import wg.hub.Entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Timo", "Informatics"));
                put(2, new Student(2, "Henrik", "Mathe"));
                put(3, new Student(3, "Lennart", "EE"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return students.get(id);
    }

    @Override
    public void deleteStudentById(int id) {
        students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
