package com.xworkz.scholarship.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "scholarship_table")
@NamedQuery(name = "updateByEmailAndPhone", query = "update ScholarshipEntity se set se.course = :course where se.email= :email and se.phone= :phone")
@NamedQuery(name="updateByPhoneAndAlive", query= "update ScholarshipEntity se set se.email= :email where se.alive = :alive and se.phone = :phone")
@NamedQuery(name="getAll",query = "select se from ScholarshipEntity se")
@NamedQuery(name = "getNameAndEmailById", query = "Select se.name, se.email from ScholarshipEntity se where se.id= :id")
@NamedQuery(name="getCountByEmailAndDate",query="select count(se) from ScholarshipEntity se where se.email= :email and se.registrationDate= :registrationDate")
@NamedQuery(name="getCountByAge" ,query="select count(se) from ScholarshipEntity se where se.age > :age")
@NamedQuery(name="getNameAndEmailAndPhoneById" ,query="select se.name, se.email , se.phone from ScholarshipEntity se where se.id= :id")
@NamedQuery(name="getAllByEmailAndPh",query="select se from ScholarshipEntity se where se.email= :email and se.phone= :phone")
@NamedQuery(name="deleteByNameAndAge",query="delete from ScholarshipEntity se where se.name= :name and se.age= :age")

public class ScholarshipEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	private int age;
	private String course;
	@Column(name = "registration_date")
	private LocalDate registrationDate;
	@Column(name = "approval_date")
	private LocalDate approvalDate;
	private boolean alive;
	private double amount;
	private String status;

	public ScholarshipEntity() {

	}

	public ScholarshipEntity(String name, String email, long phone, int age, String course, LocalDate registrationDate,
			LocalDate approvalDate, boolean alive, double amount, String status) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.course = course;
		this.registrationDate = registrationDate;
		this.approvalDate = approvalDate;
		this.alive = alive;
		this.amount = amount;
		this.status = status;
	}

	@Override
	public String toString() {
		return "ScholarshipEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age="
				+ age + ", course=" + course + ", registrationDate=" + registrationDate + ", approvalDate="
				+ approvalDate + ", alive=" + alive + ", amount=" + amount + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (alive ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((approvalDate == null) ? 0 : approvalDate.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phone ^ (phone >>> 32));
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScholarshipEntity other = (ScholarshipEntity) obj;
		if (age != other.age)
			return false;
		if (alive != other.alive)
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (approvalDate == null) {
			if (other.approvalDate != null)
				return false;
		} else if (!approvalDate.equals(other.approvalDate))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone != other.phone)
			return false;
		if (registrationDate == null) {
			if (other.registrationDate != null)
				return false;
		} else if (!registrationDate.equals(other.registrationDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(LocalDate approvalDate) {
		this.approvalDate = approvalDate;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
