package com.java;

public class StaticMethod {
	int rollno;
	String name;
	float fee;
	static String college="ABIT";
	StaticMethod(int rollno, String name, float fee){
		this.rollno= rollno;
		this.name=name;
		this.fee=fee;
	}
void display() {
	System.out.println(rollno+" "+name+" "+fee+" "+college);
}
public class StaticMethod1{
	public static void maun(String[]args) {
		StaticMethod s1= new StaticMethod(150,"twinkle",50000);
		StaticMethod s2= new StaticMethod(140,"tutulu",40000);
		s1.display();
		s2.display();
	}

}
}
