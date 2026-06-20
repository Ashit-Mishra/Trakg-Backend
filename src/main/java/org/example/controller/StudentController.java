package org.example.controller;

import jakarta.validation.Valid;
import org.example.Exceptions.StudentNotFoundException;
import org.example.dto.DashboardResponse;
import org.example.dto.LoginRequest;
import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping
    public Student createStudents(@RequestBody @Valid Student student){
        return studentService.createStudents(student);
    }
    @PostMapping("/login")
    public DashboardResponse login(@RequestBody LoginRequest loginRequest) throws StudentNotFoundException {
        return studentService.login(loginRequest);
    }
}
