package practical.java;
//collection of framework(arrayList)
import java.util.ArrayList;

public class Autoboxing {
	public static void main(String []args) {
		ArrayList<Integer>a1= new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);//auto boxing
		System.out.println("ArrayList:" + a1);
	}

}
