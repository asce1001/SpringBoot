package com.personal.crud.service;

import com.personal.crud.dao.EmployeeRepository;
import com.personal.crud.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeRepository employeeRepository;

   @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(int id) {
       Optional<Employee> result = employeeRepository.findById(id);
       Employee employee = null;
       if(result.isPresent()) {
           employee = result.get();
       } else{
           throw  new RuntimeException("Value is null for ID"+ id);
       }
        return Optional.of(employee);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) throws Exception {
       employeeRepository.deleteById(id);
    }
}
