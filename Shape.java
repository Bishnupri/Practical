package practical.java;

public class Shape {
	String name = "circle";

}
class Size extends Shape{
	String name = "Triangle";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
}
class SuperIV{
	public static void main(String[] args) {
		Size obj = new Size();
		obj.print();
	}
}
