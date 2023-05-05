package com.Adresss.Adress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Adresss.Adress.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
