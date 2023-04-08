package com.example.demo.entities;

import com.example.demo.request.DailyRequest;

import jakarta.persistence.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class DailyReport {
@Id
@GeneratedValue( strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String status;
	
	@OneToOne
	@JoinColumn(name = "emp_id")
	public Employee employee;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
	

	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public DailyReport(DailyRequest dailyRequest) {
		this.name=dailyRequest.getName();
		this.status=dailyRequest.getStatus();
	}
}
