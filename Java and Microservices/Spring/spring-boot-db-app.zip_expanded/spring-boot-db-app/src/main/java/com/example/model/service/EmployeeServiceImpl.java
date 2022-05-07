package com.example.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.exceptions.EmployeeNotFoundException;
import com.example.model.beans.Employee;
import com.example.model.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	// since it needs dao we can inject the proxy DAO implementation provided by spring & through interface reference
	// we can access dao methods
	@Autowired
	private EmployeeDao dao;
	
	@Transactional // commits the changes
	@Override
	public Employee store(Employee e) {
		Employee savedEntity = dao.save(e);
		return savedEntity;
	}

	@Override
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
		Employee emp = dao.findById(id).orElse(null); // return null or entity that is found
		if(emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id '"+id+"' not found"); 
		}
		return emp;
	}

	@Override
	public List<Employee> findEmployeesBySalary(double salary) {
		List<Employee> list = dao.getEmployeesBySalary(salary);
		return list;
	}

	@Override
	public List<Employee> findAllEmployees() {
		return dao.findAll();
	}

	@Transactional
	@Override
	public void deleteEmployeeById(int id) throws EmployeeNotFoundException {
		Employee emp = findEmployeeById(id);
		// next line is executed only if there's no null as findEmployeeById() already handled null
		dao.delete(emp);
	}

	@Transactional
	@Override
	public void deleteEmployeeBySalary(double salary) {
		dao.deleteBySalary(salary);
	}

	@Transactional
	@Override
	public Employee updateEmployeeSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee emp = findEmployeeById(id); // emp [1, Raj 40000]
		emp.setSalary(salary); // update the salary
		return dao.save(emp); // updates the existing entity
	}
	
}
