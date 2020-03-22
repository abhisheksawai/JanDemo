package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();  
		 list.add("Ravi");  
		 list.add("Vijay");  
		 list.add("Vijay");  
		 list.add("Ajay");  
		 System.out.println(list);
		 
		 HashSet<String> set1=new HashSet(list);  
		 set1.add("check");
		 set1.add("check");
		 
		 System.out.println(set1);
		
			ArrayList<String> list1=new ArrayList<String>(set1);  
			list1.add("anothercheck");
			
			list1.add("anothercheck");
			System.out.println(list1);  // guess?
		
	}

}
