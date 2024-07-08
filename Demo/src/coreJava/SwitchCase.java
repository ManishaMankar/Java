package coreJava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		switch (num) {
		case 10:
			System.out.println("Test case is running on "+num);
			break;
		case 50:
			System.out.println("Test case is running on "+num);
			break;
		case 100:
			System.out.println("Test case is running on "+num);
			break;

		default:
			System.out.println("please write appropriate number");
			break;
		}
			Scanner sc1=new Scanner (System.in);
			System.out.println("Enter the number");
			int num1=sc1.nextInt();
			switch (num1) {
			case 1:
				System.out.println("Poor Performance....");
				break;
			case 2:
				System.out.println("Need to improvement....");
				break;
			case 3:
				System.out.println("Good Performance....");
				break;
			case 4:
					System.out.println("Excellent Performance...");
					break;
			case 5 :
					System.out.println("Employee of the year...");
					break;
		

				default:
					System.out.println("please write appropriate number");
					break;

		
		}
	   }
	}
	

	


