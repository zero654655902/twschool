package com.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lwan on 26/07/2017.
 */
@Entity
public class Student implements Comparable {
    @Id
    @GeneratedValue()
    private String id;
    private String name;
    private String email;
    private String phone;
    private String idCard;
    private String city;
    private int math=0;
    private int chinese=0;
    private int english=0;
    private int coding=0;

    public Student() {
    }

    public Student( String id,String name, String email,String phone,String idCard,String city) {
        this.name = name;
        this.id = id;
        this.email=email;
        this.phone=phone;
        this.idCard=idCard;
        this.city=city;

    }

    public Student( String id,String name,int math, int chinese, int english, int coding) {
        this.name = name;
        this.id = id;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
        this.coding = coding;

    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
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
        return this.id;
    }
    public String getName() {
        return this.name;
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

   @Override
    public int compareTo(Object obj)
   {
       return 0;
   }

   @Override
    public boolean equals(Object obj){
        return toString().equals(obj.toString());
   }


}
