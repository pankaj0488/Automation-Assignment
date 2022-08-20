package Automation;

public class Oops_Concepts {

	public Oops_Concepts() {
		this(20, 90, 100);
		System.out.println("parent constructor");
	}
	
	public Oops_Concepts(int a) {
		this();
		System.out.println("Parent one peramaterized constructor");
	}
	
	public Oops_Concepts(int b, int c) {
		this(11);
		System.out.println("Parent two paramaterized constructor");
	}
	
	public Oops_Concepts(int d, int c1, int c2) {
		System.out.println("Parent three paramaterized constructor");
	}
	
	public Oops_Concepts(int a1, int a2, int a3, int a4) {
		System.out.println("Parent four paramaterized constructor");
	}
	
	public static void main(String[] args) {
		Oops_Concepts obj=new Oops_Concepts(21, 20); 
		
	}


}
