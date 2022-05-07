package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptions.EmployeeNotFoundException;
import com.example.model.beans.Employee;
import com.example.model.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeRest {

	// Inject Service Implementation to the Service interface
	@Autowired
	private EmployeeService service;
	// private EmployeeServiceImpl service; // not advisable as it is tightly coupled code
	
	// {"name":"Vijay", "salary":35000}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> storeEmp(@RequestBody Employee employee) {
		ResponseEntity<Object> response = null;
		Employee savedObject = service.store(employee);
		response = ResponseEntity.status(HttpStatus.CREATED).body(savedObject);
		return response;
	}
	
	// Retrieve All 
	@GetMapping
	public ResponseEntity<Object> getEmployees() {
		return ResponseEntity.status(HttpStatus.OK).body(service.findAllEmployees());
	}
	
	// Retrieve by id {empId} can accept dynamic path like /1, /2, /3
	// @PathVariable extracts the value {empId} takes and assigns to parameter
	@GetMapping("/{empId}")
	public ResponseEntity<Object> getEmployeeById(@PathVariable("empId") int id) {
		ResponseEntity<Object> response = null;
		try {
			Employee emp = service.findEmployeeById(id);
			response = ResponseEntity.status(HttpStatus.OK).body(emp);
		} catch (EmployeeNotFoundException e) {
			String msg = "{\"msg\":"+"\""+e.getMessage()+"\""+"}";
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
		}
		return response;
	}
	
	@DeleteMapping("/{empId}")
	public ResponseEntity<Object> deleteById(@PathVariable("empId") int id) {
		ResponseEntity<Object> response = null;
		try {
			service.deleteEmployeeById(id);
			String successMsg = "{\"msg\":"+"\"Record "+id+" deleted\""+"}";
			response = ResponseEntity.status(HttpStatus.OK).body(successMsg);
		} catch (EmployeeNotFoundException e) {
			String msg = "{\"msg\":"+"\""+e.getMessage()+"\""+"}";
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
		}
		return response;
	}
}
