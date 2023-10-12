package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee addEmployee(String firstName,String lastName);

    Employee searchEmployee(String firstName, String lastName);

    Employee deleteEmployee(String firstName, String lastName);

    Collection<Employee> searchAll();
}
