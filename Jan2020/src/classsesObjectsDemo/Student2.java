package classsesObjectsDemo;

public class Student2 {	
	
	int rollno;
	String name;
										//rr					//nn
	public void pushdata(int rollno , String name)
	{
		this.rollno = rollno;  
		this.name = name;
		
		System.out.println(rollno);
		System.out.println(name);
	}
	
	public void display()
	{
		System.out.println(rollno);
		System.out.println(name);
	}
		
}
