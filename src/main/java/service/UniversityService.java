package service;

import dao.UniversityRepository;
import domain.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UniversityService {
    @Autowired
    private UniversityRepository universityRepository;

    @Transactional(readOnly = true)
    public List<University> findUniversities() {
        return universityRepository.findAll();
    }
}
