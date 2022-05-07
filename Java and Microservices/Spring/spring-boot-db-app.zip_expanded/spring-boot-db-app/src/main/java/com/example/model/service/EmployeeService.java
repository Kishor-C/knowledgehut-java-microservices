package com.example.model.service;

import java.util.List;

import com.example.exceptions.EmployeeNotFoundException;
import com.example.model.beans.Employee;

// interface the Controller uses as a reference
public interface EmployeeService {
	public Employee store(Employee e); // returns stored entity
	// return employee if found else throw exception
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException; 
	// return employees by salary
	public List<Employee> findEmployeesBySalary(double salary);
	// return all employees in the List<Employee>
	public List<Employee> findAllEmployees();
	// delete employee by id
	public void deleteEmployeeById(int id) throws EmployeeNotFoundException;
	// delete employee by salary
	public void deleteEmployeeBySalary(double salary);
	// update employee salary by id
	public Employee updateEmployeeSalary(int id, double salary) throws EmployeeNotFoundException;	
}
