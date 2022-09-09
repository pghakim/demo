package com.quintrix.sb.demo.dao;
import com.quintrix.sb.demo.model.Employee;
import java.util.List;

public interface employeeDao {

    public List<Employee> getEmployee();
    public Object getEmployee(int id);
    public int postEmployee(Employee employee);
    public int updateEmployee(Employee employee, int id);
    public Object deleteEmployee(String firstname, int id);

}
