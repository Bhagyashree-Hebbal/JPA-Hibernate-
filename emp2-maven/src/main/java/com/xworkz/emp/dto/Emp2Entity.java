package com.xworkz.emp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "emp2_table")
@NamedQuery(name = "findById", query = "select ed from Emp2Entity ed where ed.id=4")
@NamedQuery(name = "findByName", query = "select ed from Emp2Entity ed where ed.name='Niriksha'")
@NamedQuery(name = "findByEmail", query = "select ed from Emp2Entity ed where ed.email='varun@gmail.com'")
@NamedQuery(name = "findByPhoneNo", query = "select ed from Emp2Entity ed where ed.phoneNo=9876543210L")
@NamedQuery(name = "findByAddress", query = "select ed from Emp2Entity ed where ed.address='Hassan'")
@NamedQuery(name = "findByNameAndPhoneNo", query = "select ed from Emp2Entity ed where ed.name='Rohan' and ed.phoneNo=4321098765L")
@NamedQuery(name = "findByNameAndEmail", query = "select ed from Emp2Entity ed where ed.name='Meera' and ed.email='meera@gmail.com'")
@NamedQuery(name = "findByPhoneNoAndEmail", query = "select ed from Emp2Entity ed where ed.phoneNo=9857595214L and ed.email='sohita@gmail.com'")
@NamedQuery(name = "findByNameAndAddress", query = "select ed from Emp2Entity ed where ed.name='Bhagyashree' and ed.address='Bangalore'")
@NamedQuery(name = "findByEmailAndAddress", query = "select ed from Emp2Entity ed where ed.email='shanta@gmail.com' and ed.address='Mysore'")
public class Emp2Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@Column(name = "phone_no")
	private long phoneNo;
	private int age;
	private String address;

	public Emp2Entity() {
		System.out.println("No-arg const");
	}

	public Emp2Entity(String name, String email, long phoneNo, int age, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp2Entity [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", age=" + age
				+ ", address=" + address + "]";
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
