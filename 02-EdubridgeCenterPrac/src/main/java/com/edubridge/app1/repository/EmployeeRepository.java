package com.edubridge.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.app1.model.Employee;

@RepositoryRestResource(path = "employe-details", collectionResourceRel = "employee")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
