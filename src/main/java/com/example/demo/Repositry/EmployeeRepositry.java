package com.example.demo.Repositry;

import com.example.demo.entity.EmployeeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositry extends JpaRepository<EmployeeUser, Long> {
}
