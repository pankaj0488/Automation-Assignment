package Automation;

public class Arithemetic_2 {
	public int sub(int a, int b) {
		int c;
		c=a-b;
		System.out.println("sub result of" +c);
		return c;
		
	}
	
	public int sum(int m1, int m2) {
		int m3;
		m3=m1+m2;
		System.out.println("sum result of" +m3);
		return m3;
		
	}
	
	public int sub1 (int x1, int x2) {
		int x3;
		x3=x1-x2;
		System.out.println("sub result of " +x3);
		return x3;
				
	}
	
	
	public int multi (int b1, int b2) {
		int b3;
		b3=b1*b2;
		System.out.println("sub result of " +b3);
		return b3;
				
	}
	
	public int div(int k1, int k2) {
		int k3;
		k3=k1/k2;
		System.out.println("sub result of " +k3);
		return k3;
				
	}
	
	public static void main(String[] args) {
		Arithemetic_2 obj=new Arithemetic_2();
		int subresult=obj.sub(10,5);
		int sumresult=obj.sum(subresult, 6);
		int sub1result=obj.sub1(sumresult, 4);
		int mltresult=obj.multi(sub1result, 4);
		int divresult=obj.div(mltresult, 4);
		System.out.println("Final result is" + divresult);
		
	}
	
	
	

}
