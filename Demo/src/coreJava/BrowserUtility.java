package coreJava;

import java.util.Scanner;

public class BrowserUtility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name.");
		String bname=sc.nextLine();
		if(bname.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Test case is running on "+bname);
		}else if
		(bname.equalsIgnoreCase("Edge"))
		{
			System.out.println("Test case is running on "+bname);
		}else
		if(bname.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Test case is running on "+bname);
		}else
		{
			System.out.println("Please enter the appropriate browser name");
		}

	}

}
