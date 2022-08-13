package Automation;

public class Constructor
{
	public Constructor() {
		this(4,7,9,10);
		System.out.println("Default Constructor");
	}
	
	public Constructor(int a) {
		this();
		System.out.println("One Peramaterized Constructor");
	}
	
	public Constructor(int u, int b) {
		this(8);
		System.out.println("two peramaterized Constructor");
	}
	
	public Constructor(int j, int k, int p) {
		this(2,5);
		System.out.println("three paramaterized Constructor");
		
	}
	
	public Constructor(int m1, int m2, int m3, int m4) {
		System.out.println("four paramaterized Constructor");
		
	}
	
	
	public static void main(String[] args) {
		Constructor obj=new Constructor(20,30,6);   //three parametrized
		
	}
	

}
