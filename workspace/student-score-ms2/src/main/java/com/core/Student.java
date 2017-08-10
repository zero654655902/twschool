package com.core;

/**
 * Created by lwan on 26/07/2017.
 */
public class Student {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String idCard;
    private String city;


    public Student() {
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

}
