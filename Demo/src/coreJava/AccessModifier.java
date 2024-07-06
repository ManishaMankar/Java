package coreJava;

public class AccessModifier {
	int id=101;
	public String name= "Sarang";
	private int salary=78000;
	protected int acno=89898989;

	public static void main(String[] args) {
		AccessModifier as=new AccessModifier(); 
		System.out.println("Student id is : "+as.id);
		System.out.println("Student name is : "+as.name);
		System.out.println("Student salary is : "+as.salary);
		System.out.println("Student account number is : "+as.acno);
		
		

	}

}
