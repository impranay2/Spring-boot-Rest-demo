package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResourceApi {
	
	@RequestMapping(value="/employee/exists/{eid}",method = RequestMethod.GET)
	public String isEmployeeChecks(@PathVariable("eid") int empId)throws EmployeeNotFoundException {
		  
    	if(empId>5) {
    		throw new EmployeeNotFoundException("Employee, " + empId + ", is not found ");
    	             }
    	
    	return "employee found";
    } 
	@RequestMapping(value="/employee/exist/{eid}",method = RequestMethod.GET)
	public String isEmployeeChecks(){
		  return "employee found here";
    } 
	

}
