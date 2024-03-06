package com.tiagorodrigues.schoolapi.resources;

import com.tiagorodrigues.schoolapi.entities.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/students")
public class StudentResource {

    @GetMapping
    public ResponseEntity<Student> findAll() {
        Student s = new Student(1L, "Tiago Rodrigues", "tiago@email.com", "19999999999");
        return ResponseEntity.ok().body(s);
    }
}
