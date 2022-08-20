package Automation;

public class Child_Method extends Parent_Method {
	
	public void M() {
		super.m2();
		System.out.println("Default child method");
	}
	
	public void M1() {
		this.M2();
		System.out.println("Child one method");
	}
	
	public void M2() {
		this.M3();
		System.out.println("Child two method");
	}
	
	public void M3() {
		this.M();
		System.out.println("Child three method");
	}
	
	public void M4() {
		System.out.println("Child four method");
	}
	public static void main(String[] args) {
		
		Child_Method obj=new Child_Method();
			obj.M1();
		
	}
	

}
