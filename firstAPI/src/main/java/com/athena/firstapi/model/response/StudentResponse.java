package com.athena.firstapi.model.response;

import com.athena.firstapi.model.entity.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StudentResponse {
    private int id;
    private String name;
    private LocalDate birth;
    private String className;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public StudentResponse() {
    }


    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.birth = student.getBirth();
        this.className = student.getClassName();
        this.createdAt = student.getCreatedAt();
        this.updatedAt = student.getUpdatedAt();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
