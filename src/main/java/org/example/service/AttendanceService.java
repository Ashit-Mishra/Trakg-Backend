package org.example.service;

import org.example.dto.AttendanceResponse;
import org.example.entity.Attendance;
import org.example.repository.AttendanceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }
    public List<Attendance> getAllAttendance(){
        return attendanceRepository.findAll();
    }
    public Attendance saveAttendance(Attendance attendance){

        return attendanceRepository.save(attendance);
    }
    public List<Attendance> getAttendanceByStudentId(Long studentId){
        return attendanceRepository.findByStudentId(studentId);
    }
    public double getOverallAttendance(Long studentId){
        List<Attendance> attendanceList = attendanceRepository.findByStudentId(studentId);
        int attended = 0;
        int total = 0;
        for(Attendance attendance: attendanceList){
            attended += attendance.getClassAttended();
            total += attendance.getTotalClasses();
        }
        return (attended * 100.0) / total;
    }
    public AttendanceResponse getResponse(Long attendanceId){

        Attendance attendance = attendanceRepository.findById(attendanceId).get();
        double percentage = (attendance.getClassAttended() * 100.0) / attendance.getTotalClasses();
        return new AttendanceResponse(
                attendance.getStudent().getName(),
                attendance.getSubject().getSubjectName(),
                percentage

        );
    }
    public List<AttendanceResponse> getSubjectWiseResponse(Long studentId){
        List<Attendance> attendanceList = attendanceRepository.findByStudentId(studentId);
       List<AttendanceResponse> attendanceResponse = new ArrayList<>();
       for(Attendance attendance: attendanceList){
           double percentage =
                   (attendance.getClassAttended() * 100.0)
                           / attendance.getTotalClasses();

           attendanceResponse.add(
                   new AttendanceResponse(
                           attendance.getSubject().getSubjectName(),
                           percentage
                   )
           );
       }

        return attendanceResponse;
       }

    }

