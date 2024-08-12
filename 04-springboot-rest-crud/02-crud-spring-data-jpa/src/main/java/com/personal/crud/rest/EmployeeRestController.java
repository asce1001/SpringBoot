package com.personal.crud.rest;

import com.personal.crud.entity.Employee;
import com.personal.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> findById(@PathVariable int employeeId) throws Exception {
        Optional<Employee> employee = employeeService.findById(employeeId);
        if(employee == null){
            throw new Exception("Employee Id not found " + employeeId);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        return employeeService.save(theEmployee);
    }

    @PutMapping("/employees")
    public  Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteById(@PathVariable int employeeId) throws Exception {
        Optional<Employee> theEmployee = employeeService.findById(employeeId);
        if(theEmployee.isEmpty()){
            throw new Exception("Employee not found with ID" + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted employee Id " + theEmployee.get().getId();
    }
}
