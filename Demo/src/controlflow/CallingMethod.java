package controlflow;

import coreJava.AccessModifier;

public class CallingMethod extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier as=new AccessModifier(); 
		System.out.println("Student name is :"+as.name);
		CallingMethod c1=new CallingMethod();
		System.out.println("Student accout number is : "+c1.acno);
		
		

	}

}
