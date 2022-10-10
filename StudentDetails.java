package com.java;

public class StudentDetails {
	int id;
	String name;
	StudentAddress1 address;
	public StudentDetails(int id, String name, StudentAddress1 address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void show() {
		System.out.println(id+" "+name);
		System.out.println(address.area+" "+address.city+" "+address.district);
	}
	public static void main(String[]args) {
		StudentAddress1 a1=new StudentAddress1("newtown","Kolkata","north 24");
		StudentDetails d1 =new StudentDetails(1,"pallabi",a1);
		d1.show();
	}

}
