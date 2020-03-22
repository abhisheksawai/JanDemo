package classsesObjectsDemo;

public class Student {	
	//instance varivale
	int rollno;
	String name;
	static String collegename;
	
public static void main(String[] args) 

{		
		//classname objectname = new classname();
		Student s = new Student();
		System.out.println(s);
		//s.admission();
		s.rollno = 100;
		s.name = "Abhishek";
		
}
public void insertdata(int rol, String nm) {		
	rol = rollno;
	nm = name;
	System.out.println(rol);
	System.out.println(nm);
	System.out.println("=========");
	System.out.println(rollno);
	System.out.println(name);
	
	System.out.println("=========");
	rollno = rol;
	name = nm;
	System.out.println(rollno);
	System.out.println(name);
	}

public void pushdata(int rr , String nn)
{
	rollno = rr;
	name = nn;
	System.out.println(rollno);
	System.out.println(name);
}

}
