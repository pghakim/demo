package com.quintrix.sb.demo.service;
import com.quintrix.sb.demo.model.Employee;
import com.quintrix.sb.demo.dao.employeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class employeeServiceImpl implements employeeService {

    @Autowired
    employeeDao employeeDao;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getEmployee();
    }

    @Override
    public int postEmployee(Employee emp) {
        return  employeeDao.postEmployee(emp);
    }

    @Override
    public int updateEmployee(Employee emp, int id) {
        return employeeDao.updateEmployee(emp, id);
    }

    @Override
    public Object getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }

    @Override
    public Object deleteEmployee(String firstName, int id) {
        return employeeDao.deleteEmployee(firstName, id);
    }
}
