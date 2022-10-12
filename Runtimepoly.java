package practical.java;

public class Runtimepoly {
	int value=50;
	void show() {
		System.out.println("show anything");
	}
}
	
	class TestRuntimepoly extends Runtimepoly{
		int value=70;
		void show() {
			System.out.println("show nothing");
	}
		public static void main(String []args) {
			Runtimepoly obj = new TestRuntimepoly();
			obj.show();
			System.out.println("value :"+obj.value);
		}
	}

