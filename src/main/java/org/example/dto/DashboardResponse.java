package org.example.dto;

import org.example.entity.Attendance;
import org.example.entity.Student;

import java.util.List;

public class DashboardResponse {
    private String studentName;
    private double overallAttendance;
    private List<AttendanceResponse> subjects;

    public DashboardResponse(String studentName, double overallAttendance, List<AttendanceResponse> subjects) {
        this.studentName = studentName;
        this.overallAttendance = overallAttendance;
        this.subjects = subjects;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getOverallAttendance() {
        return overallAttendance;
    }

    public void setOverallAttendance(double overallAttendance) {
        this.overallAttendance = overallAttendance;
    }

    public List<AttendanceResponse> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<AttendanceResponse> subjects) {
        this.subjects = subjects;
    }
}
