package com.jspiders.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.jspiders.pkg1.Certificate;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private Certificate ceti;
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	

	public Student() {
		super();
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

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	public Certificate getCeti() {
		return ceti;
	}


	public void setCeti(Certificate ceti) {
		this.ceti = ceti;
	}


	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
