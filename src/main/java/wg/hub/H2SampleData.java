package wg.hub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import wg.hub.Dao.StudentRepository;
import wg.hub.Entity.Student;

import java.rmi.activation.ActivationGroup_Stub;

@Component
public class H2SampleData implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    StudentRepository studentRepo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Student timo = new Student();
        timo.setName("Timo");
        timo.setCourse("Informatics");

        Student henrik = new Student();
        henrik.setName("Henrik");
        henrik.setCourse("Mathe");

        Student lennart = new Student();
        lennart.setName("Lennart");
        lennart.setCourse("EE");

        studentRepo.save(timo);
        studentRepo.save(henrik);
        studentRepo.save(lennart);
    }
}
