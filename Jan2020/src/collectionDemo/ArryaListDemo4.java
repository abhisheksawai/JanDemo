package collectionDemo;

import java.util.ArrayList;

public class ArryaListDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		System.out.println("size-");
		System.out.println(al.size());
		al.add("abhishek");  //0
		al.add(10); //1   //al.add((Integer.valueof(10));  
		al.add('Y');  //2
		al.add("abhishek");
		al.add(null);
		System.out.println("before"+al);
		al.add(2, "abhijeet");
		
		System.out.println("after"+al);		
		al.remove("abhishek");
		System.out.println("size-");
		System.out.println(al.size());
		
		
		
	}

}
