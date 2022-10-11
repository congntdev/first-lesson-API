package com.athena.firstapi.controller;


import com.athena.firstapi.model.entity.Student;
import com.athena.firstapi.model.request.CreatStudentRequest;
import com.athena.firstapi.model.request.UpdateStudentRequest;
import com.athena.firstapi.model.response.StudentResponse;
import com.athena.firstapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/athena/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable int id) {
       StudentResponse response = service.getStudentById(id);
       return ResponseEntity.ok(response);
    }

    @PostMapping("/create")
    public ResponseEntity<StudentResponse> create(@RequestBody CreatStudentRequest request) {
        StudentResponse response = service.create(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<StudentResponse> update(@PathVariable int id, @RequestBody UpdateStudentRequest request) {
        StudentResponse response = service.update(id, request);
            return ResponseEntity.ok(response);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
