package collectionDemo;

import java.util.ArrayList;

public class ArryaListDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("abhishek");  //0
		al.add(10); //1
		al.add('Y');  //2
		al.add("abhishek");
		al.add(null);
		
		System.out.println(al);
		al.remove(2);		
		
		System.out.println(al);
		
		al.remove("abhishek");
		
		System.out.println(al);
		
		al.removeAll(al);
		System.out.println("after remove all--");
		System.out.println(al);
	}

}
