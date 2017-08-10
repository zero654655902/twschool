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


    public List<Student> getStudentById(String id[]){
        List<Student> idStudent = new ArrayList<Student>();
        for (int i = 0; i < kclass.size(); ++i) {
            for (int j = 0; j < id.length; ++j) {
                if (kclass.get(i).getId().equals(id[j])) {
                    idStudent.add(kclass.get(i));
                    break;
                }

            }
        }
        return idStudent;

    }

    public List<Student> getTotalStudent() {

        return this.kclass;
    }

}
