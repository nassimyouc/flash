package net.javaguides.todoapp.model;

public class Add {
	
	private Long id;
	private String name;
	private String father;
	private String mother;
	private int mobilenumber;
	private String gender;
	private String email;
	private String bloodgroup;
	private String address;
	
	
	
	
	public Add() {
		
	}
	public Add(String name, String father, String mother, int mobilenumber, String gender, String email,
			String bloodgroup, String address) {
		super();
		
		this.name = name;
		this.father = father;
		this.mother = mother;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.email = email;
		this.bloodgroup = bloodgroup;
		this.address = address;
	}
	public Add(Long id, String name, String father, String mother, int mobilenumber, String gender, String email,
			String bloodgroup, String address) {
		super();
		this.id = id;
		this.name = name;
		this.father = father;
		this.mother = mother;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.email = email;
		this.bloodgroup = bloodgroup;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
