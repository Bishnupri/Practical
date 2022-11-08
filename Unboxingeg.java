package practical.java;

import java.util.ArrayList;

public class Unboxingeg {
	public static void main(String []args) {
		ArrayList<Integer>a1= new ArrayList<Integer>();
		//auto boxing
		a1.add(5);
		a1.add(2);
		System.out.println("ArrayList:" + a1);
		//Unboxing
		int a= a1.get(0);
		int b= a1.get(1);// 5 Integer convert to int
		System.out.println("Value of Index 0:"+a+" "+b);
	}
}
