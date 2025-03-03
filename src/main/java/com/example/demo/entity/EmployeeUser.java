package com.example.demo.entity;


import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
//import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "employee")
public class EmployeeUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;


    //    @NotNull(message = "This cannot be empty")
    private String name;

    private double salary;

    private String department;

    public EmployeeUser() {

    }

    public EmployeeUser(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }


}
