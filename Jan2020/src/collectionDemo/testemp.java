package collectionDemo;

public class testemp {

	public static void main(String[] args) {
	
		emp e1 = new emp(101, "abhishek");
		emp e2 = new emp(102, "abhijeet");
		emp e3 = new emp(103, "Kunal");
		
		//int b[]=new int[3];
		emp e[] = new emp[3];
		
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;

		for(int i=0; i<3;i++)
		{
			System.out.println(e[i]);
			System.out.println("added tostring method from object class");
			System.out.println(e[i].toString());
			
			
			//System.out.println(e[i].empid);
			//System.out.println(e[i].name);
			//
		}
		
	}

}
