package domain;

import jakarta.persistence.*;

@Table(name = "sr_faculty")
@Entity
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faculty_id")
    private Long facultyId;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id")
    private University university;
    @Column(name = "faculty_name")
    private String facultyName;

}
