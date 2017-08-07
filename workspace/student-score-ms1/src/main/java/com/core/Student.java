package com.core;

/**
 * Created by lwan on 26/07/2017.
 */
public class Student {
    private int math;
    private int chinese;
    private int english;
    private int coding;
    private String name;
    private String id;


    private String email;
    private String phone;
    private String idCard;
    private String city;


    public Student() {
    }

    public Student(String name, String id, int math, int chinese, int english, int coding) {
        this.name = name;
        this.id = id;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
        this.coding = coding;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTotalScore() {
        int totalScore = this.chinese + this.math + this.coding + this.english;
        return totalScore;
    }

    public double getAverage() {
        double averageScore = getTotalScore() / 4.0;
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

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getCity() {
        return city;
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
