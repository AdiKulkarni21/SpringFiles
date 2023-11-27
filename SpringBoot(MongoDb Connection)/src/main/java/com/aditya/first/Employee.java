package com.aditya.first;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component; 

@Document(collection="employee")
public class Employee { 
	
	private int employee_Id; 
	private String Employee_Name; 
	private String Password; 
	
	public Employee(int employee_Id,String Employee_Name, String Password) { 
		super(); 
		this.employee_Id=employee_Id;
		this.Employee_Name = Employee_Name; 
		this.Password = Password; 
	}

	public int getemployee_Id() {
		return this.employee_Id;
	}

	public void setemployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public String getEmployee_Name() {
		return this.Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.Employee_Name = employee_Name;
	}

	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}


} 
