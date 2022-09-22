package com.spring_doctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestDoctor {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(com.spring_doctor.Doctor.class);
		Doctor doc = ctx.getBean(Doctor.class);
		doc.setName("Sachin");
		doc.setDegree("MBBS");
		doc.p1.setPatientName("Sham");
		doc.p1.setDesease("Covid19");
		System.out.println(doc);
	}

}
