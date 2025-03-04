package com.example.demo.service;

import com.example.demo.Repositry.EmployeeRepositry;
import com.example.demo.entity.EmployeeUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    private final EmployeeRepositry employeeRepositry;

    public EmployeeService(EmployeeRepositry employeeRepositry) {
        this.employeeRepositry = employeeRepositry;
    }
    public List<EmployeeUser> getAllEmployees() {
        return employeeRepositry.findAll();
    }
    public Optional<EmployeeUser> getEmployeeId(Long id) {
        return employeeRepositry.findById(id);
    }
    public EmployeeUser saveEmployee(EmployeeUser employee){
        return employeeRepositry.save(employee);
    }
    public EmployeeUser updateEmployee(Long id, EmployeeUser employee){
        Optional<EmployeeUser> existingEmp = getEmployeeId(id);
        if(existingEmp.isPresent()){
            EmployeeUser employee1 = existingEmp.get();
            employee1.setName(employee.getName());
            employee1.setDepartment(employee.getDepartment());
            employee1.setSalary(employee.getSalary());
            return employeeRepositry.save(employee1);
        }
        return null;
    }

    //method to delete employee
    public boolean deleteEmployee(Long id){
        if(employeeRepositry.existsById(id)){
            employeeRepositry.deleteById(id);
            return true;
        }
        return false;
    }

}
