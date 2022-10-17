package practical.java;

public class VaragrsEg {
	static void show(String...text) {
		for(String s:text) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		show();
		show("hi");
		show("i","love","coading");
	}

}
