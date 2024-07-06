package coreJava;

public class Array {

	public static void main(String[] args) {
		int sid[]=new int[5];
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		System.out.println("Length of the array is : "+sid.length);
		System.out.println(sid[0]);
		System.out.println("______________________________");
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		String name[]=new String[3];
		name[0]="Manisha";
		name[1]="Puja";
		name[2]="Ovi";
		System.out.println("Length of the array is : "+name.length);
		for(String i:name)
		{
			System.out.println(i);
		}

	}

}
