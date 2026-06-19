package org.example.service;

import org.example.entity.Subject;
import org.example.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }
    public Subject saveSubjects(Subject subject){
        return subjectRepository.save(subject);
    }
}
