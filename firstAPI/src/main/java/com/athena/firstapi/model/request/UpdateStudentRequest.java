package com.athena.firstapi.model.request;

import java.time.LocalDate;

public class UpdateStudentRequest {
    private String name;
    private LocalDate birth;
    private String className;

    public UpdateStudentRequest() {
    }

    public UpdateStudentRequest(String name, LocalDate birth, String className) {
        this.name = name;
        this.birth = birth;
        this.className = className;
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
}
