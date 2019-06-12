package com.spring.DI;

import java.util.List;
import java.util.Map;

public class Employee {
int age;
String name;
Address address;
List<String> answers;
List<Address> addrList;
Map<Address,PersonalInfo> map;
public Employee(int age){
	this.age=age;
}

public Employee(String name){
	this.name=name;
}

public Employee(int age,String name,Address address,List<String> answers,List<Address> addrList,Map<Address,PersonalInfo> map){
	this.age=age;
	this.name=name;
	this.address=address;
	this.answers=answers;
	this.addrList=addrList;
	this.map=map;
}
public void show() {
	//System.out.println(age+"  "+name+" "+ address.toString()+" "+answers+" "+addrList);
	System.out.println(map);
}
}
