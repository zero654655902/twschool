package com.student.conroller;

import java.util.*;

/**
 * Created by lwan on 04/08/2017.
 */
public class EmployeeService {

    List<Employee> employeeList=new ArrayList<>();
    public List<Employee> addEmployee(Employee employee){
        employeeList.add(employee);
        return employeeList;
    }

}
