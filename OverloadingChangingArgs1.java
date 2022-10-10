package com.java;

public class OverloadingChangingArgs1 {
	static int sum(int a, int b) {
		return a+ b;}
	static double sum(double x, double y,double z) {
		return x+y+ z;}
	public static void main(String[]args) {
		System.out.println(OverloadingChangingArgs1.sum(5, 6));
		System.out.println(OverloadingChangingArgs1.sum(5.4, 6.3,7.9));
	}
	
	
	

}
