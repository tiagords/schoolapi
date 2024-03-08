package com.tiagorodrigues.schoolapi.config;

import com.tiagorodrigues.schoolapi.entities.Student;
import com.tiagorodrigues.schoolapi.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student(null, "John Due", "john.due@mail.com", "5511999999999", new SimpleDateFormat( "yyyyMMdd" ).parse( "19960707" ), "43412463902", Instant.parse("2024-04-08T19:00:00Z"));
        Student s2 = new Student(null, "Jane Due", "jane.due@mail.com", "5511999999999", new SimpleDateFormat( "yyyyMMdd" ).parse( "19760501" ), "03412453802", Instant.parse("2024-04-08T19:00:00Z"));

        studentRepository.saveAll(Arrays.asList(s1, s2));
    }
}
