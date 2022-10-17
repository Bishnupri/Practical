package practical.java;
abstract class Testabstract{
	abstract void display();
	void show() {
		System.out.println("Non abstract method invoke");
	}
}
 class Demo1 extends Testabstract{
	void display() {
		System.out.println("Display method invoke");
	}
	class Demo2 extends Testabstract{
		void display() {
			System.out.println("Demo2 method invoke");
		}
		
	}
	class AbstractMethod{
		
	public static void main(String args[]) {
		Testabstract obj =new Demo1();
		Testabstract obj1 =new Demo1();
		obj.display();
		obj1.display();
		obj.show();
		
	}
	

}
 }
