package com.student.employee;

import java.util.List;

/**
 * Created by lwan on 04/08/2017.
 */
public class Employee {
    private String id;
    private String name;
    private int age;

//    public void setAddresses(List<Address> addresses) {
//        this.addresses = addresses;
//    }
//
//    public List<Address> getAddresses() {
//        return addresses;
//    }

        private Address address;
//private List<Address>addresses;
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

    public void setAddress(Address address) {
        this.address = address;
    }

    public  Address getAddress() {
        return address;
    }

}


