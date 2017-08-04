package com.student.conroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private Map<String,Employee> employees=new HashMap<>();
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> string() {
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }

    @RequestMapping(value = "/employees",method = RequestMethod.POST)
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        employee.setId("001");
        employees.put("001",employee);
        return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable String id){
        Employee employee=employees.get(id);
        return employee;
    }
//
//    @RequestMapping(value = "/employee/id",method = RequestMethod.GET)
//    public Map<String,Employee> getAllEmployee(){
//        return employees;
//    }

//    @RequestMapping(value = "/employee/id",method = RequestMethod.PUT)
//    public Employee modifyEmployeeById(@PathVariable String id){
//        Employee employee=employees.get(id);
//        employee.setId("002");
//        return employee;
//    }

    }



