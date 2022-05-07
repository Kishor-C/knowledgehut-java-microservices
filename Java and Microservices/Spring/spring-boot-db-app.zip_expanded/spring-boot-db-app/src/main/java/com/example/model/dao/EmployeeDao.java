package com.example.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.model.beans.Employee;

/*
 * You don't have to implement this interface
 * Spring Boot does it based on the Repository mapped to the entity
 * Spring boot does the implementation such that all the methods operate on the table the entity is mapped to
 */
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	// custom methods to perform custom operations
	@Query("select e from Employee e where e.salary = ?1")
	public List<Employee> getEmployeesBySalary(double salary);
	
	@Modifying // required when the table data is modified
	@Query("delete from Employee e where e.salary = ?1")
	public void deleteBySalary(double salary);
}
