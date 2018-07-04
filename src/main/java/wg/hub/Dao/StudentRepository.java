package wg.hub.Dao;

import org.springframework.data.repository.CrudRepository;
import wg.hub.Entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
