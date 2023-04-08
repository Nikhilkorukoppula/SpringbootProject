package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ename;
	private String year;
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}







	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}

	
	
	
}
