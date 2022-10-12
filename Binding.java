package practical.java;

class TestBinding{
	void show() {
		System.out.println("ab samjhe??");
	}
}
class Binding extends TestBinding{
	void show() {
		System.out.println("override");
}
	public static void main(String []args) {
		TestBinding obj = new Binding();
		obj.show();
	}
}














