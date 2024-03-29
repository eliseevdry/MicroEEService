package service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import rest.StudentController;
import view.StudentRequest;
import view.StudentResponse;

import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class StudentServiceTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceTest.class);

    @Autowired
    private StudentController studentController;

    @Test
    public void studentInfo() {
        StudentRequest req = new StudentRequest();
        req.setLastName("Last");
        req.setFirstName("First");
        req.setMiddleName("Middle");
        req.setDateOfBirth(LocalDate.of(2000, 4, 12));
        req.setPassportSeria("1111");
        req.setPassportNumber("222222");
        req.setPassportDate(LocalDate.of(2014, 4, 30));
        List<StudentResponse> studentInfo = studentController.getStudentInfo(req);
        Assert.assertTrue(studentInfo.size() > 0);
    }

}