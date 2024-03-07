package com.tiagorodrigues.schoolapi.config;

import com.tiagorodrigues.schoolapi.entities.Student;
import com.tiagorodrigues.schoolapi.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student(null, "John Due", "john.due@mail.com", "5511999999999");
        Student s2 = new Student(null, "Jane Due", "jane.due@mail.com", "5511999999999");

        studentRepository.saveAll(Arrays.asList(s1, s2));
    }
}
