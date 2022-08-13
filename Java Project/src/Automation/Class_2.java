package Automation;

public class Class_2 {
	public Class_2() {
		this(2,19,5);
		System.out.println("Default Constructor");
	
	}
	
	public Class_2(int a) {
		this(20,1,8,9);
		System.out.println("One Peramaterized Constructor");
	
	}
	
	public Class_2(int d, int z) {
		this (20);
		System.out.println("Two Peramaterized Constructor");
	
	}
	
	public Class_2(int k, int m, int s) {
		System.out.println("Three Peramaterized Constructor");
	
	}
	
	public Class_2(int p, int q, int f, int m) {
		this();
		System.out.println("Four Constructor");
	
	}

	
	public static void main(String[] args) {
		Class_2 obj=new Class_2(2, 10);
	}
}
