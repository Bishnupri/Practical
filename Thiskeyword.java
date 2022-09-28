package com.java;

public class Thiskeyword {
	int rollno;
	String name;
	float fee;
	static String college="ABIT";
	Thiskeyword(int rollno, String name, float fee){
		this.rollno= rollno;
		this.name=name;
		this.fee=fee;
	}
void display() {
	System.out.println(rollno+" "+name+" "+fee+" "+college);
}
public class Test{
	public static void maun(String[]args) {
		Thiskeyword s1= new Thiskeyword(150,"twinkle",50000);
		Thiskeyword s2= new Thiskeyword(140,"tutulu",40000);
		s1.display();
		s2.display();
	}

}
}
