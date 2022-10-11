package com.athena.firstapi.service;

import com.athena.firstapi.model.entity.Student;
import com.athena.firstapi.model.request.CreatStudentRequest;
import com.athena.firstapi.model.request.UpdateStudentRequest;
import com.athena.firstapi.model.response.StudentResponse;
import com.athena.firstapi.respository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService, StudentRepository {
    @Override
    public StudentResponse create(CreatStudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setBirth(request.getBirth());
        student.setClassName(request.getClassName());
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());
        StudentRepository.students.add(student);
        return new StudentResponse(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public StudentResponse getStudentById(int id) {
        List<Student> students = StudentRepository.students;
        Student studentById = students.stream().filter(student -> student.getId() == id).findAny().get();
        return new StudentResponse(studentById);
    }

    @Override
    public StudentResponse update(int id, UpdateStudentRequest request) {
        Student studentUpdated = students.stream().filter(student -> student.getId() == id).findAny().get();
        studentUpdated.setName(request.getName());
        studentUpdated.setBirth(request.getBirth());
        studentUpdated.setClassName(request.getClassName());
        return new StudentResponse(studentUpdated);
    }

    @Override
    public String delete(int id) {
        Optional<Student> studentDeleted = students.stream().filter(student -> student.getId() == id).findAny();
        if (studentDeleted.isPresent()) {
            students.remove(studentDeleted);
            return "Successful deleted!";
        }
        return "This ID isn't available yet!";
    }
}
