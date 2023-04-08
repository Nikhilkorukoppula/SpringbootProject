package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.DailyReport;
import com.example.demo.entities.Employee;
import com.example.demo.repository.*;
import com.example.demo.request.DailyRequest;

@RestController
public class ControllerClass {

	
	 @Autowired 
	 private EmployeeRepositry repo;
	  
	  @Autowired
	  private DailyRepostRepository drepo;
	  
	  @PostMapping("inserting")
	  public ResponseEntity<DailyReport>insert(@RequestBody DailyRequest dailyRequest){
		  Employee employee=new Employee();
		  employee.setEname(dailyRequest.getEname());
		  employee.setYear(dailyRequest.getYear());
		  employee=repo.save(employee);
		  
		  DailyReport dailyReport=new DailyReport(dailyRequest);
		 dailyReport.setEmployee(employee);
		 dailyReport=drepo.save(dailyReport);
		  return new ResponseEntity<DailyReport>(dailyReport,HttpStatus.CREATED);
	  }
}
