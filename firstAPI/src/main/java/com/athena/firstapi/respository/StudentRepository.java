package com.athena.firstapi.respository;

import com.athena.firstapi.model.entity.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {

    LocalDateTime moment1 = LocalDateTime.now();
    LocalDateTime moment2 = LocalDateTime.now().minusDays(1).minusHours(1);
    LocalDateTime moment3 = LocalDateTime.now().minusDays(2).minusHours(3);
    LocalDateTime moment4 = LocalDateTime.now().minusDays(3).minusHours(2);

    List<Student> students = new ArrayList<>() {
        {
            add(new Student(1, "Laura", LocalDate.of(2001, 10, 10), "JB101", moment1, moment3));
            add(new Student(1, "Maya", LocalDate.of(2001, 10, 10), "JB101", moment2, moment4));
            add(new Student(1, "Jame", LocalDate.of(2001, 10, 10), "JB101", moment1, moment3));
            add(new Student(1, "Mark", LocalDate.of(2001, 10, 10), "JB101", moment3, moment3));
            add(new Student(1, "Philip", LocalDate.of(2001, 10, 10), "JB101", moment4, moment4));
            add(new Student(1, "Jessica", LocalDate.of(2001, 10, 10), "JB101", moment2, moment3));
            add(new Student(1, "Leona", LocalDate.of(2001, 10, 10), "JB101", moment1, moment3));
            add(new Student(1, "Zed", LocalDate.of(2001, 10, 10), "JB101", moment1, moment2));
            add(new Student(1, "Sun", LocalDate.of(2001, 10, 10), "JB101", moment2, moment3));
            add(new Student(1, "Moon", LocalDate.of(2001, 10, 10), "JB101", moment1, moment4));
            add(new Student(1, "Jay", LocalDate.of(2001, 10, 10), "JB101", moment2, moment3));
        }
    };
}
