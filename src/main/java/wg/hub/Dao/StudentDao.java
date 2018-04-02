package wg.hub.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import wg.hub.Entity.Student;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(0, new Student(1, "Timo", "Informatics"));
                put(1, new Student(2, "Henrik", "Mathe"));
                put(2, new Student(3, "Lennart", "EE"));
            }
        };
    }


    public Collection<Student> getAllStudents() {
        return students.values();
    }


}
