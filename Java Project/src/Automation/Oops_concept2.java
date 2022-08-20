package Automation;

public class Oops_concept2 extends Oops_Concepts
 {

	public Oops_concept2() {
		this(20, 98);
		System.out.println("default child constructor");
	
	}
	
	public Oops_concept2(int a) 
	{
		this();
		System.out.println("Child one paramaterized constructor");
	
	}
	
	public Oops_concept2(int b1, int b2) {
		super (20,98);
		System.out.println("Child two paramaterized constructor");
	
	}
	
	public Oops_concept2(int c1, int c2, int c3) {
		this (20);
		System.out.println("Child three paramaterized constructor");
	
	}
	
	public Oops_concept2(int m1, int m2, int m3, int m4) {
		System.out.println("Child four paramaterized constructor");
	
	}
	
	public static void main(String[] args) {
		Oops_concept2 obj=new Oops_concept2(20, 25, 25);
	}
	

}

