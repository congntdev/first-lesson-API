package com.athena.firstapi.service;

import com.athena.firstapi.model.entity.Student;
import com.athena.firstapi.model.request.CreatStudentRequest;
import com.athena.firstapi.model.request.UpdateStudentRequest;
import com.athena.firstapi.model.response.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create(CreatStudentRequest request);

    List<Student> getAll();

    StudentResponse getStudentById(int id);

    StudentResponse update(int id, UpdateStudentRequest request);

    String delete(int id);
}
