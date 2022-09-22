package com.spring_doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.spring_doctor")
public class Doctor {
	String name;
	String degree;
	@Autowired
	patient p1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public patient getP1() {
		return p1;
	}
	public void setP1(patient p1) {
		this.p1 = p1;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", degree=" + degree + ", p1=" + p1 + "]";
	}
	
	
	

}
