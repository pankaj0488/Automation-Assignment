package Automation;

public class Arthemetic {
	
	public int sum1(int a, int b) 
	{
		int c;
		c=a+b;
		System.out.println("sum result of"+c);
		return c;
		
	}
	
	public int sum(int x, int y) {
		
	int z;
	z=x+y;
	System.out.println("sum results of" +z);
	return z;
		
	}
	
	public int sub(int m, int n) 
	{
		int p;
		p=m+n;
		System.out.println("sum result of " +p);
		return p;
	
	}
	
	public int mul(int k, int j) {
		int f;
		f=k*j;
		System.out.println("multi result of" +f);
		return f;
		
	}
	
	public int div(int m1, int m2) 
	{
		int m3;
		m3=m1/m2;
		System.out.println("final result is" +m3);
		return m3;
		
	}
	
	public static void main(String[] args) {
		Arthemetic obj=new Arthemetic();
		int sumresult=obj.sum1(20,25);
		int sumresult1=obj.sum(sumresult, 15);
		int subresult=-obj.sub(sumresult1, 20);
		int multiresult=obj.mul(subresult, 2);
		int divresult=obj.div(multiresult, 3);
		System.out.println("final result is" +divresult);
		System.out.println("Latest code push" +divresult);
		
		
	}

}
