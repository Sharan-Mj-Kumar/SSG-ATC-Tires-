package com.example.ESS.Controller;

import com.example.ESS.Service.EmployeeService;
import com.example.ESS.Table.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String showAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee-list";
    }

    @GetMapping("/employees")
    public String backButton() {
        return "employee-list";
    }

    @GetMapping("/employees/generate-salary-slip")
    public String generateSalarySlip(@RequestParam Integer empNo, Model model) {
        Employee employee = employeeService.getEmployeeById(empNo);
        model.addAttribute("employee", employee);
        return "salary-slip";
    }


}
