package practical.java;

public interface Multiple1 {
	void show();}
interface Multiple2{
	void display();}
class Multiple implements Multiple1,Multiple2{
	public void show() {
		System.out.println("hi");}
		public void display() {
			System.out.println("Hello");
		}
		public static void main(String args []) {
			Multiple obj = new Multiple();
			obj.show();
			obj.display();
		
	}

}
