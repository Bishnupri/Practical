package com.java;

public class TestOverridding {
	void run() {
		System.out.println("running mode on");
		
	}
	class Overriding extends TestOverridding{
		void run() {
			System.out.println("running mode off");
		}
		public static void main(String[]args) {
			Overridding a= new Overridding();
			a.run();
		}
	}

}
