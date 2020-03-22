package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArryaListDemo11 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//System.out.println(al4);
	
		al.add("One");  //0
		al.add(10); //1   //al.add((Integer.valueof(10));  
		al.add('Y');  //2
		al.add("Two");
		
		ListIterator listiter = al.listIterator();
		while(listiter.hasPrevious())
		{
			System.out.println(listiter.previous());
		}
		
		
		
		
		
		
	}

}
