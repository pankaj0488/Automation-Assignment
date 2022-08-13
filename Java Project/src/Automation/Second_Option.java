package Automation;

public class Second_Option {
	
	public void Class() {
		this.Class_3(0, 0, 0);
		
		System.out.println("Default Method");
	}
	
	public void class_1(int s) {
		this.Class4(s, s, s, s);
		System.out.println("one paramaterized method");
		
	}
	
	public void Class_2(int a, int b) {
		this.class_1(b);

		System.out.println("2 parameterized method");
		
	}
	
	public void Class_3(int f, int j, int k) {

		System.out.println("3 parameterized method");

	}
	
	public void Class4(int m1, int m2, int m3, int m4) {
		this.Class();

		System.out.println("4 parameterized method");

	}
	
	public static void main(String[] args) {
		Second_Option obj=new Second_Option();
		obj.Class_2(5,2);
			
		
	}
	
	
	

}
