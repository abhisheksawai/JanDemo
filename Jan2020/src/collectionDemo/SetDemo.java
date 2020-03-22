package collectionDemo;

import java.util.HashSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();  
		 list.add("Ravi");  
		 list.add("Vijay");  
		 list.add("Ajay");  

		
		HashSet<String> set=new HashSet();  
		set.add("abhishek");
		set.add("narayan");
		set.add("kapil here");
		set.add("xerox");
		set.add("abhishek");
		
		System.out.println(set);
		
	}

}
