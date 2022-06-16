package controller;

import domain.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UniversityService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping(path = "/universityList")
public class UniversityListController {
    @Autowired
    private UniversityService service;

    @GetMapping
    public String findUniversities(Model model) {
        List<University> list = service.findUniversities();
        model.addAttribute("today", LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        model.addAttribute("universities", list);
        return "universityList";
    }
}
