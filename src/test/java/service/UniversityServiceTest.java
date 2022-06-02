package service;

import domain.University;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class UniversityServiceTest {

    @Autowired
    private UniversityService service;

    @Test
    public void findUniversities() {
        List<University> list = service.findUniversities();
        list.forEach(u -> System.out.println(
                u.getUniversityId() + " : " + u.getUniversityName()));
    }
}