package dao;

import domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select st from Student st where st.lastName = :lastName and " +
            "st.firstName = :firstName and st.middleName = :middleName and " +
            "st.dateOfBirth = :dateOfBirth and st.passportSeria = :passportSeria and " +
            "st.passportNumber = :passportNumber and st.passportDate = :passportDate")
    List<Student> findStudent(@Param("lastName") String lastName,
                              @Param("firstName") String firstName,
                              @Param("middleName") String middleName,
                              @Param("dateOfBirth") LocalDate dateOfBirth,
                              @Param("passportSeria") String passportSeria,
                              @Param("passportNumber") String passportNumber,
                              @Param("passportDate") LocalDate passportDate);
}
