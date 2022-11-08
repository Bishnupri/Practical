package practical.java;
//wrapper to primitive
public class Unboxing {
	public static void main(String []args) {
		Integer a= new Integer(2);
		Integer i= a.intValue();
		Integer j= a;
		System.out.println(a+" "+i+" "+j);
	}
}
