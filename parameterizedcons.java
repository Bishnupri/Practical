package com.java;

public class parameterizedcons {
	int age;
	String name;
	parameterizedcons(int a, String n){
		age=a;
		name=n;
	}
	void show() {
		System.out.println(age+" "+name);}
	public static void main(String[]args) {
		parameterizedcons d=new parameterizedcons(18,"tutulu");
		parameterizedcons d1=new parameterizedcons(6,"dugu");
		d.show();
		d1.show();
	}
	}



