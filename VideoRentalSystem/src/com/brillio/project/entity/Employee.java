package com.brillio.project.entity;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailId;
	private String password;
	private String role;
	
	public Employee() {
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [employeeId=%s, firstName=%s, lastName=%s, phoneNumber=%s, emailId=%s, password=%s, role=%s]",
				employeeId, firstName, lastName, phoneNumber, emailId, password, role);
	}
	
	
	
	
	
}
