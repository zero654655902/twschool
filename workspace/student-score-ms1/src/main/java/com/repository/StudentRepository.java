package com.repository;

import com.core.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lwan on 10/08/2017.
 */
public interface StudentRepository extends JpaRepository<Student,String>{
    Student findById(String id);
}
