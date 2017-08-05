//package com.student.conroller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RestController
//public class HelloController {
//
////    private Map<String,Employee> employees=new HashMap<>();
////    @RequestMapping(value = "/hello", method = RequestMethod.GET)
////    public ResponseEntity<String> string() {
////        return new ResponseEntity<String>("hello", HttpStatus.OK);
////    }
//
//
////    @Autowired
////    EmployeeService employeeService;
//  List<Employee>employeeList=new ArrayList<>();
//
//    @RequestMapping(value = "/employees",method = RequestMethod.POST)
//    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
//        return new ResponseEntity<Employee>( employee, HttpStatus.CREATED);
//    }
//
//    @RequestMapping(value = "/employees/{id}",method = RequestMethod.GET)
//    public Employee getEmployeeById(@PathVariable String id){
//        for(Employee employee:employeeList){
//            if(employee.getId()==id)
//            {
//                return employee;
//            }
//        }
//        return null;
//    }
//
//
//
////    @RequestMapping(value = "/employees",method = RequestMethod.POST)
////    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
////        employee.setId("001");
////        employees.put("001",employee);
////        return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
////    }
////
////    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
////    public Employee getEmployeeById(@PathVariable String id){
////        Employee employee=employees.get(id);
////        return employee;
////    }
//////
//////    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
//////    public Map<String,Employee> getAllEmployee(){
//////        return employees;
//////    }
////
////    @RequestMapping(value = "/employee/{id}",method = RequestMethod.PUT)
////    public Employee modifyEmployeeById(@PathVariable String id, @RequestBody Employee employee){
////        employee=employees.get(id);
////        employee.setId("002");
////        return employee;
////    }
////
////    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
////    public Map<String, Employee> deleteEmployeeById(@PathVariable String id){
////        employees.remove("001");
////        return employees;
////    }
//
//    }
//
//
//
