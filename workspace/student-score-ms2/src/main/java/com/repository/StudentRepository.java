package com.repository;

import com.core.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by lwan on 12/08/2017.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student save(Student student);

    Student findById(String id);
}

