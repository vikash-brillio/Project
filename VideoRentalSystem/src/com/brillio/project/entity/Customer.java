package com.brillio.project.entity;

public class Customer {

	private int customerId;
	private String customerName;
	private String contactNumber;
	private String alternateNumber;
	private String emailId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private int postalCode;
	private String idProof;
	private String pathToId;
	private double depositMoney;
	private boolean status;
	
	public Customer() {
		}
	
	
	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAlternateNumber() {
		return alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getPathToId() {
		return pathToId;
	}

	public void setPathToId(String pathToId) {
		this.pathToId = pathToId;
	}

	public double getDepositMoney() {
		return depositMoney;
	}

	public void setDepositMoney(double depositMoney) {
		this.depositMoney = depositMoney;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}




	@Override
	public String toString() {
		return String.format(
				"Customer [customerId=%s, customerName=%s, contactNumber=%s, alternateNumber=%s, emailId=%s, addressLine1=%s, addressLine2=%s, city=%s, postalCode=%s, idProof=%s, pathToId=%s, depositMoney=%s, status=%s]",
				customerId, customerName, contactNumber, alternateNumber, emailId, addressLine1, addressLine2, city,
				postalCode, idProof, pathToId, depositMoney, status);
	}

	
	
	
	
	
	
	
	
	
}
