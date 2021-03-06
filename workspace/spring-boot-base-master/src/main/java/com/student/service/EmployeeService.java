package com.student.service;
import com.student.employee.Address;
import com.student.employee.Employee;
import org.springframework.stereotype.Service;

import java.util.*;


/**
 * Created by lwan on 04/08/2017.
 */

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }


    public Employee getEmployeeById(String id) {
        Employee employee = new Employee();
        for (int i = 0; i < employees.size(); ++i) {
            if (id.equals(employees.get(i).getId())) {
                employee = employees.get(i);
            }
        }
        return employee;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }




    public Employee modifyEmployeeById(String id,Employee employee) {
        for (int i = 0; i < employees.size(); ++i) {
            if (id.equals(employees.get(i).getId())) {
                Employee emp = employees.get(i);
                emp.setId(employee.getId());
                emp.setAge(employee.getAge());
                emp.setName(employee.getName());
               emp.setAddress(employee.getAddress());
            }
        }
        return employee;

    }

    public boolean deleteEmployeeById(String id) {
        Employee employee;
        boolean flag = false;
        for (int i = 0; i < employees.size(); ++i) {
            if (id.equals(employees.get(i).getId())) {
                employee = employees.get(i);
                employees.remove(employee);
                flag = true;
            }
        }
        return flag;
    }
}
