package Automation;

public class Parent_Method {
	
	public void m() {
		this.m3();
		System.out.println("default parent method");
		
	}
	
	public void m1() {
		this.m();
		System.out.println("Parent one method");
		
	}
	
	public void m2() {
		this.m1();
		System.out.println("Parent two method");
		
	}
	
	public void m3() {
		System.out.println("Parent three method");
		
	}
	
	public void m4() {
		System.out.println("Parent four method");
		
	}
	
public static void main(String[] args) {
	Parent_Method obj=new Parent_Method();
	
	
}
	
	
	
	


}
