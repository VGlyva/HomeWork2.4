package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.exception.EmployeeAlreadyException;
import pro.sky.skyprospringdemo.exception.EmployeeNotFoundException;
import pro.sky.skyprospringdemo.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee searchEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            return employee;
    }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> searchAll() {
        return Collections.unmodifiableList(employeeList);
    }
}
