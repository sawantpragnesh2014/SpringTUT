package com.spring.DI;

public class PersonalInfo {
String maritalStatus;
String bloodGroup;

public PersonalInfo(String maritalStatus,String bloodGroup) {
	// TODO Auto-generated constructor stub
	this.maritalStatus=maritalStatus;
	this.bloodGroup=bloodGroup;
}

@Override
public String toString() {
	return "PersonalInfo [maritalStatus=" + maritalStatus + ", bloodGroup=" + bloodGroup + "]";
}
}
