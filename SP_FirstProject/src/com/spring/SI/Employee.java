package com.spring.SI;

import java.util.List;
import java.util.Map;

public class Employee {
int age;
String name;
Address address;
List<String> answers;
List<Address> addrList;


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


public List<String> getAnswers() {
	return answers;
}


public void setAnswers(List<String> answers) {
	this.answers = answers;
}


public List<Address> getAddrList() {
	return addrList;
}


public void setAddrList(List<Address> addrList) {
	this.addrList = addrList;
}


public void show() {
	System.out.println(age+"  "+name+" "+ address+" "+answers+" "+addrList);
	//System.out.println(map);
}
}
