package coreJava;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153,rm,sum=0;
		int temp=num;
		while(num>0)
		{
			rm=num%10;
			num=num/10;
			sum=sum+(rm*rm*rm);
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println(temp+"Number is Armstrong");
		}else
		{
			System.out.println(temp+"Number is not Armstrong");
		}

	}

}
