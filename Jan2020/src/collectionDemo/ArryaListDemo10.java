package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArryaListDemo10 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//System.out.println(al4);
	
		al.add("One");  //0
		al.add(10); //1   //al.add((Integer.valueof(10));  
		al.add('Y');  //2
		al.add("Two");
	
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----");
		ListIterator listiter = al.listIterator();
		while(listiter.hasNext())
		{
			System.out.println(listiter.next());
		}
		System.out.println("---prev");
		while(listiter.hasPrevious())
		{
			System.out.println(listiter.previous());
		}
		
		
	}

}
