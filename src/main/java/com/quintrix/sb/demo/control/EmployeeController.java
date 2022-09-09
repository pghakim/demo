package com.quintrix.sb.demo.control;


import com.quintrix.sb.demo.model.Employee;
import com.quintrix.sb.demo.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/start")
public class EmployeeController {


    @Autowired
    employeeService empEmployeeService;


    @GetMapping(path = "/employeelist")
    public List<Employee> getEmployees(){
        return empEmployeeService.getAllEmployees();
    }

    @GetMapping("/employeelist/{id}")
    public Object getEmployee(@PathVariable int id){
        return empEmployeeService.getEmployee(id);
    }
    @PostMapping("/employeelist")
    public int postEmployee(@RequestBody Employee emp){
        return empEmployeeService.postEmployee(emp);
    }
    @PutMapping("/employeelist/{id}")
    public int updateUser(@RequestBody Employee emp, @PathVariable int id ){
        return empEmployeeService.updateEmployee(emp, id);
    }
    @DeleteMapping("/employeelist/{firstName}/{id}")
    public Object deleteUser(@PathVariable String firstName, @PathVariable int id){
        return empEmployeeService.deleteEmployee(firstName, id);
    }

}