package com.tiagorodrigues.schoolapi.services;

import java.util.List;
import java.util.Optional;

import com.tiagorodrigues.schoolapi.entities.Student;
import com.tiagorodrigues.schoolapi.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById(Long id) {
        Optional<Student> obj = repository.findById(id);
        return obj.get();
    }

    public Student insert(Student obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
