package coreJava;

import java.util.Scanner;

public class RuntimeException {
	int x=100;

	public static void main(String[] args) {
		RuntimeException r1=new RuntimeException();
		r1=null;
		try
		{
		System.out.println(r1.x);//NullPointerException
		}catch(Exception e)
		{
			System.out.println("Object is null please check the object "+e.getMessage());
		}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition of two number is "+(a+b));
		System.out.println("Subtraction of two number is "+(a-b));
		try
		{
		System.out.println("Division of two number is "+(a/b));//ArithmeticException
	     }catch(ArithmeticException o)
	     {
	    	 System.out.println("Please enter other number than 0 number "+o.getMessage());
	     }
	     System.out.println("Multiplication of two number is "+(a*b));
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the index 0 to 4");
		int index=sc1.nextInt();
		int array []= {10,20,30,40,50};
		try 
		{
			System.out.println(array[index]);//ArrayIndexOutOfBoundsException*/
		}catch(Exception p)
		{
			System.out.println("Enter valid index "+p.getMessage());
		}
		
		String s1="200ggh";
		System.out.println(s1+900);
		try
		{
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+900);
		}catch(Exception h)
		{
			System.out.println("input is not parasable "+h.getMessage());
		}
		}
	
		

	}


