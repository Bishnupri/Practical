package practical.java;

public interface DeMo01 {
	void show();

}
class Test implements DeMo01{

	@Override
	public void show() {
		System.out.println("Hello my future Employee");
	}
	public static void main(String args []) {
		Test obj = new Test();
		obj.show();
		
	}
	
}
