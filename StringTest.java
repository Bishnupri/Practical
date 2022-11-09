package practical.java;

import java.util.Scanner;

public class StringTest {
	public void show() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String A = s.next();
		String B = s.next();
		System.out.println(A.length()+B.length());
		System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
		System.out.println(A.substring(0,4). toUpperCase()+A.substring(2)+" " +B.substring(0,3).toLowerCase()+B.substring(1));
	}
public static void main(String...args) {
	StringTest t = new StringTest();
	t.show();
}
}
