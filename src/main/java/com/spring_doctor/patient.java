package com.spring_doctor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.spring_doctor")
public class patient {
	
	String patientName;
	String desease;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDesease() {
		return desease;
	}
	public void setDesease(String desease) {
		this.desease = desease;
	}
	@Override
	public String toString() {
		return "patient [patientName=" + patientName + ", desease=" + desease + "]";
	}
	
	
	

}
