package org.example.controller;

import jakarta.validation.Valid;
import org.example.dto.AttendanceResponse;
import org.example.entity.Attendance;
import org.example.service.AttendanceService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }
    @GetMapping
    public List<Attendance> getAllAttendance(){
        return attendanceService.getAllAttendance();
    }
    @PostMapping
    public Attendance saveAttendance(@RequestBody @Valid Attendance attendance){
        return attendanceService.saveAttendance(attendance);
    }
    @GetMapping("/student/{studentId}")
    public List<Attendance> getAttendanceByStudentId(@PathVariable Long studentId){
        return attendanceService.getAttendanceByStudentId(studentId);
    }
    @GetMapping("/student/{studentId}/overall")
    public double getOverallAttendance(@PathVariable Long studentId){
        return attendanceService.getOverallAttendance(studentId);
    }
    @GetMapping("/{attendanceId}/response")
        public AttendanceResponse getResponse(@PathVariable Long attendanceId){
            return attendanceService.getResponse(attendanceId);
        }
    @GetMapping("/student/{studentId}/response")
    public List<AttendanceResponse> getSubjectWiseResponse(@PathVariable Long studentId){
        return attendanceService.getSubjectWiseResponse(studentId);
    }

}
