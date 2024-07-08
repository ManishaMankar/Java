package coreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(30);
		l1.add(50);
		l1.add(60);
		l1.add(80);
		l1.add(10);
		l1.add(null);
		System.out.println(l1);
		System.out.println("Total size of arrayList is? "+l1.size());
		System.out.println("Is arrayList isEmpty is: "+l1.isEmpty());
		System.out.println("Is arrayList can contain 30? "+l1.contains(30));
		System.out.println("Is arrayList can contain 90? "+l1.contains(90));
		System.out.println("********************************");
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Manisha");
		a1.add("Anita");
		a1.add("Fana");
		a1.add("Shahid");
		a1.add("Amit");
		System.out.println(a1);
		System.out.println("Total size of arrayList is : "+a1.size());
		for(String i:a1)
		{
			System.out.println(i);
		}
		System.out.println("**************using itrator****************");
		
		Iterator<String>ir=a1.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		

	}

}
