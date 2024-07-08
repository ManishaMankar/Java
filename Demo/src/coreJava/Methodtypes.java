package coreJava;

public class Methodtypes {
	int a=10,b=20;
	public void show()
	{
		System.out.println("Show method will displyed.....");
	}
	public void add()
	{
		System.out.println("Addition of two number is"+(a+b));
	}
	public void sub()
	{
		int a=56,b=8;
		int res=(a-b);
		System.out.println("Subtraction of two number is :"+res);
	}
	public void mul(int a, int b)
	{
		System.out.println("Multiplication of two number is"+(a*b));
	}
	public void div(int a, int b)
	{
		System.out.println("Division of two number is"+(a/b));
	}
	

	public static void main(String[] args) {
		Methodtypes m1 =new Methodtypes();
		m1.show();
		m1.add();
		m1.sub();
		m1.mul(4, 3);
		m1.div(20, 4);
		

	}

}
