package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArryaListDemo14Generics {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new studentcol(100, "kapil"));
		al.add(new studentcol(101, "Narayan"));
		al.add(new empcol(201, "Abhijeet"));
		
		ArrayList<studentcol > al2 = new ArrayList<studentcol>();
		al2.add(new studentcol(104, "Abhishek"));
		//al2.add(new empcol(201, "Abhijeet"));
		System.out.println(al2);
		
		ArrayList<String> als = new ArrayList<String>();
		als.add("abhi");
		als.add(100);
		
		System.out.println(als);
		
		
		for(Object a:al)
		{
			System.out.println(a);
			
			if(a instanceof studentcol)
			{
				System.out.println(((studentcol) a).name);
			}
			
			if(a instanceof empcol)
			{
				System.out.println(((empcol) a).ename);
			}
		
		}
		
		
				
	}

}
