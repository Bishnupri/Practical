package practical.java;

import java.util.Scanner;

 public class Encapsulation_demo{
	 public static void main(String args[])
		{
			try (Scanner sc = new Scanner(System.in)) {
				String stuname;
				int stupass,sid;
				int sub1,sub2,sub3,sub4,sub5;
				//User input using scanner
				System.out.println("Enter your name");
				stuname=sc.nextLine();
				System.out.println("Enter your User_Id");
				sid=sc.nextInt();
				System.out.println("Enter your password");
				stupass=sc.nextInt();
				
				System.out.println("Enter your maks of 5 subjects: ");
				System.out.println("Enter the marks of sub1:- ");
				sub1=sc.nextInt();
				System.out.println("Enter the marks of sub2:- ");
				sub2=sc.nextInt();
				System.out.println("Enter the marks of sub3:- ");
				sub3=sc.nextInt();
				System.out.println("Enter the marks of sub4:- ");
				sub4=sc.nextInt();
				System.out.println("Enter the marks of sub5:- ");
				sub5=sc.nextInt();
				
				Encapsulation_Demo obj=new Encapsulation_Demo();
				obj.set_name(stuname);
				obj.set_pass(stupass);
				obj.set_stu_id(sid);;
				
				System.out.println("Name: "+obj.get_name());
				System.out.println("User Id:- "+obj.get_stu_id());;
				System.out.println("Password: "+obj.get_pass());
				obj.calc(sub1, sub2, sub3, sub4, sub5);
				System.out.println("Percentage: "+obj.percentage);
			}
			
		}
	}
 class Encapsulation_Demo {
	 private String Student_name;
	 private int Student_id;
	 private int password;
	 int total,percentage;
public String get_name() {
	return Student_name;
}
public int get_stu_id() {
	return Student_id;
}
public int get_pass() {
	return password;
}
public void set_name(String stu) {
	Student_name = stu;
}
public void set_stu_id(int stu) {
	Student_id = stu;
}
public void set_pass(int stu) {
	password = stu;
}
public void calc(int sub1,int sub2,int sub3,int sub4,int sub5) {
	total=sub1+sub2+sub3+sub4+sub5;
	percentage = total/5;
	if (percentage>=35 && percentage>=45 ) {
		System.out.println("D Grade");
	}
	else if (percentage>=45 && percentage>=55 ) {
		System.out.println("C Grade");
	}
	else if  (percentage>=60 && percentage>=75 ) {
		System.out.println("B Grade");
	}
	else if  (percentage>=75 && percentage>=85 ) {
		System.out.println("D Grade");
	}
	else if (percentage>=85 && percentage>=100 ) {
		System.out.println("D Grade");
	}
	else {
		System.out.println("Fail/Absent");
	}
}
	 
	

}
