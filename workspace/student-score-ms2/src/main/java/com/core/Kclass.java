package com.core;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lwan on 27/07/2017.
 */
@Service
public class Kclass {
    private List<Student> kclass = new ArrayList<Student>();
    public void setKclass(List<Student> kclass) {
        this.kclass = kclass;

    }
    public void addStudentMessage(Student stu) {
        kclass.add(stu);
    }


    public List<Student> getTotalStudent() {

        return this.kclass;
    }

}
