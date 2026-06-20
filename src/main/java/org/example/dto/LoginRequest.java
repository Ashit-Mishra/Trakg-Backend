package org.example.dto;

public class LoginRequest {
    private Long studentId;
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(Long studentId, String password) {
        this.studentId = studentId;
        this.password = password;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long Id) {
        this.studentId = Id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
