package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArryaListDemo9 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		List al4 = new ArrayList();
	
		
		al4.add("abhijeet");
	System.out.println(al4);
	
		al.add("abhishek");  //0
		al.add(10); //1   //al.add((Integer.valueof(10));  
		al.add('Y');  //2
		al.add("abhishek");
	
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
