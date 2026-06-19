package org.example.service;

import org.example.entity.Attendance;
import org.example.repository.AttendanceRepository;
import org.springframework.stereotype.Service;

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
}
