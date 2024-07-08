package coreJava;

public class MethodDemo {
	public void M1()
	 {
		System.out.println("M1 is calling");
		M2();
	 }
	public void M2()
	 {
		System.out.println("M2 is calling");
		M3();
	 }
	public void M3()
	 {
		System.out.println("M3 is calling");
	 }

	public static void main(String[] args) {
		 MethodDemo obj=new  MethodDemo();
		 obj.M1();

	}

}
