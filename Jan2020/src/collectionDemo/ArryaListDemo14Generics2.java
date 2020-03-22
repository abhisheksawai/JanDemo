package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArryaListDemo14Generics2 {
	
	public static void main(String[] args) {
		
		
		ArrayList<studentcol> al2 = new ArrayList<studentcol>();
		al2.add(new studentcol(104, "Abhishek"));
		al2.add(new studentcol(101, "a"));
		al2.add(new studentcol(102, "b"));
		
		for( studentcol studata: al2)
		{
			System.out.println(studata.name);
			System.out.println(studata.roll);
		}
		
		
		
		
				
	}

}
