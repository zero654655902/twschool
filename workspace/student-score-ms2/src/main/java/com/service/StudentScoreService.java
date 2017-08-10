package com.service;

import com.core.Kclass;
import com.core.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwan on 10/08/2017.
 */
@Service
public class StudentScoreService {
    private Kclass kclass=new Kclass();
    public Student addStudentMessage(Student student) {
        kclass.addStudentMessage(student);
        return student;
    }

    public List<Student> reportAllStudentMessage() {
        List<Student> students=kclass.getTotalStudent();
        return students;

    }
}
