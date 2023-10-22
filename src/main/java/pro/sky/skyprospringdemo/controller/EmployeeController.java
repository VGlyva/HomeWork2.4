package pro.sky.skyprospringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.model.Employee;
import pro.sky.skyprospringdemo.service.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @RequestMapping("/add")
    public Employee addEmployee(@RequestParam String firstName,
                                @RequestParam String lastName) {
        return service.addEmployee(firstName, lastName);
    }
    @RequestMapping("/remove")
    public Employee deleteEmployee(@RequestParam String firstName,
                                @RequestParam String lastName) {
        return service.deleteEmployee(firstName, lastName);
    }
    @RequestMapping("/search")
    public Employee searchEmployee(@RequestParam String firstName,
                                @RequestParam String lastName) {
        return service.searchEmployee(firstName, lastName);
    }
    @GetMapping
    public Collection<Employee> searchAll() {
        return service.searchAll();
    }
}
