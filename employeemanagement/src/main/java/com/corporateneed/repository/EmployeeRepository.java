package com.corporateneed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corporateneed.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}