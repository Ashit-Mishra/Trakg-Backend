package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttendanceResponse {
    private String studentName;
    private String subjectName;
    private double percentage;

    public AttendanceResponse() {
    }

    public AttendanceResponse(String studentName, String subjectName, double percentage) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.percentage = percentage;
    }

    public AttendanceResponse(String subjectName, double percentage) {
        this.subjectName = subjectName;
        this.percentage = percentage;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
