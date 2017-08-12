package com.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by lwan on 10/08/2017.
 */

public class StudentScore {

    private String id;
    private int math;
    private int chinese;
    private int english;
    private int coding;


    public StudentScore(){}
    public StudentScore(String id,int math,int chinese,int english,int coding){
        this.id=id;
        this.math=math;
        this.chinese=chinese;
        this.coding=coding;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setCoding(int coding) {
        this.coding = coding;
    }

    public String getId() {
        return id;
    }

    public int getMath() {
        return math;
    }

    public int getChinese() {
        return chinese;
    }

    public int getEnglish() {
        return english;
    }

    public int getCoding() {
        return coding;
    }



}
