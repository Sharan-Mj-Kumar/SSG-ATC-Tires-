package com.example.ESS.Service;

import com.example.ESS.Repository.EmployeeRepository;
import com.example.ESS.Table.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int empNo) {
        return employeeRepository.findById(empNo).orElse(null);
    }

}
