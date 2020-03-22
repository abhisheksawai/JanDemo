package collectionDemo;

import java.util.ArrayList;

public class ArryaListDemo6 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
	
		al.add("abhishek");  //0
		al.add(10); //1   //al.add((Integer.valueof(10));  
		al.add('Y');  //2
		al.add("abhishek");
		al.add(null);
		System.out.println("printing"+al);
		
		//al.remove(10);		
		al.remove("10");
		System.out.println("printing after remove 10-"+al);
		
		al.set(1, 5);
		System.out.println("printing after set one-"+al);
		
		System.out.println(al.isEmpty());
		
		
	}

}
