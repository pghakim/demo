package com.quintrix.sb.control;


import com.quintrix.sb.model.Employee;
import com.quintrix.sb.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    employeeService empEmployeeService;


    @GetMapping("/employeelist")
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