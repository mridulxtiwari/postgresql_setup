package com.springboot.projects.postgres_setup.repository;

import com.springboot.projects.postgres_setup.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
