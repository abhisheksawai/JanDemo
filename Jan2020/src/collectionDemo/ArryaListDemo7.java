package collectionDemo;

import java.util.ArrayList;

public class ArryaListDemo7 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
	
		al.add("abhishek");  //0
		al.add(10); //1   //al.add((Integer.valueof(10));  
		al.add('Y');  //2
		al.add("abhishek");
		al.add(null);
		System.out.println("printing"+al);
		
		ArrayList al1 = new ArrayList(al);
		System.out.println("printing al1"+al1);
		
		ArrayList al2 = new ArrayList();
		al2.add("al2kadata");
		al2.addAll(al);
		al2.add("al2ka another data");
		System.out.println("printing al2"+al2);
		
	}

}
