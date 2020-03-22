package collectionDemo;

import java.util.ArrayList;

public class ArryaListDemo8 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
	
		al.add("abhishek");  //0
		al.add(10); //1   //al.add((Integer.valueof(10));  
		al.add('Y');  //2
		al.add("abhishek");
		al.add(null);
		
		System.out.println(al.get(2));
		
		for(int i = 0;i < al.size(); i ++)
		{
			System.out.println(al.get(i));
		}
		
	}

}
