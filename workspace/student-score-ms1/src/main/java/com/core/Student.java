package com.core;

/**
 * Created by lwan on 26/07/2017.
 */
public class Student {
    private final int math;
    private final int chinese;
    private final int english;
    private final int coding;
    private final String name;
    private final String id;



    public Student(String name, String id, int math, int chinese, int english, int coding) {
        this.name = name;
        this.id = id;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
        this.coding = coding;

    }

    public int getTotalScore(){
        int totalScore=this.chinese + this.math + this.coding + this.english;
        return totalScore;
    }

    public double getAverage(){
        double averageScore=getTotalScore()/4.0;
        return averageScore;
    }


    public int getMath() {
        return this.math;
    }

    public int getChinese() {
        return this.chinese;
    }

    public int getEnglish() {
        return this.english;
    }
    public int getCoding() {

        return this.coding;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()) {
            if (this.name == ((Student) obj).getName()) {
                if (this.id == ((Student) obj).getId()) {
                    if (this.math == ((Student) obj).getMath()) {
                        if (this.chinese == ((Student) obj).getChinese()) {
                            if (this.english == ((Student) obj).getEnglish()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }


}
