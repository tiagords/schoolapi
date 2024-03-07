package com.tiagorodrigues.schoolapi.repositories;

import com.tiagorodrigues.schoolapi.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
