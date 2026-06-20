package org.example.service;

import org.example.Exceptions.InvalidCredentialsException;
import org.example.Exceptions.StudentNotFoundException;
import org.example.dto.DashboardResponse;
import org.example.dto.LoginRequest;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    private final AttendanceService attendanceService;

    public StudentService(StudentRepository studentRepository, AttendanceService attendanceService) {
        this.studentRepository = studentRepository;
        this.attendanceService = attendanceService;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student createStudents(Student student){
        return studentRepository.save(student);
    }
    public DashboardResponse login(LoginRequest loginRequest) throws StudentNotFoundException {
        Student student = studentRepository.findById(loginRequest.getStudentId()).orElseThrow(()->new StudentNotFoundException("Student not found"));
        if(!student.getPassword().equals(loginRequest.getPassword())){
            throw new InvalidCredentialsException("Invalid Password");
        }

        return new DashboardResponse(
                student.getName(),
                attendanceService.getOverallAttendance(loginRequest.getStudentId()),
                attendanceService.getSubjectWiseResponse(loginRequest.getStudentId())

        );
    }

}
