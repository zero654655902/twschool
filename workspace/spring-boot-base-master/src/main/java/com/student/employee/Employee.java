package com.student.employee;

import java.util.List;

/**
 * Created by lwan on 04/08/2017.
 */
public class Employee {
    private String id;
    private String name;
    private int age;

    private Address address;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAddresses(Address address) {
        this.address = address;
    }

    public  Address getAddress() {
        return address;
    }



}


