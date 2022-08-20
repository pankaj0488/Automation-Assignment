package Automation;

public class Class1 
{
	int a;        //global variable
	public void userA(int a)         //local variable
	{
		this.a=a;               //third use of this keyword
		System.out.println("Result of this code");
	
	}
	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.userA(20);
		System.out.println(obj.a);
		
		
	}
	

}
