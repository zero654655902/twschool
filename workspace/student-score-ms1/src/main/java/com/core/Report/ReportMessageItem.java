package com.core.Report;

import com.core.Student;

/**
 * Created by lwan on 09/08/2017.
 */
public class ReportMessageItem {

    private String id;
    private String name;
    private String email;
    private String phone;
    private String idCard;
    private String city;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public ReportMessageItem(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.email=student.getEmail();
        this.phone=student.getPhone();
        this.idCard=student.getIdCard();
        this.city=student.getCity();
    }
}
