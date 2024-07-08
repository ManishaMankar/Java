package coreJava;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=13431,rm,sum=0;
		int temp=num;
		while(num>0)
		{
			rm=num%10;
			num=num/10;
			sum=sum*10+rm;
		}
		System.out.println("Reverse num "+num+"is : "+sum);
		if(temp==sum)
		{
			System.out.println("Number is palindrome");
		}else
		{
			System.out.println("Number is not palindrome");
		}
		

	}

}
