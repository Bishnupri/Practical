package practical.java;

public class Copyarray {
	public static void main(String [] args) {
		char[]copyFrom= {'d','e','c','f','f','e','i','n'};
		char[]copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 5);
		System.out.println(String.valueOf(copyTo));
	}

}
