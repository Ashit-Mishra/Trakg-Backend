package org.example.controller;

import jakarta.validation.Valid;
import org.example.entity.Subject;
import org.example.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }
    @GetMapping
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }
    @PostMapping
    public Subject saveSubjects(@RequestBody @Valid Subject subject){

        return subjectService.saveSubjects(subject);
    }
}
