package collectionDemo;

public class testemp2 {

	public static void main(String[] args) {
	
		emp e1 = new emp(101, "abhishek");
		emp e2 = new emp(102, "abhijeet");
		emp e3 = new emp(103, "Kunal");
		emp e4 = new emp(103, "Kunal");
		emp e5 = new emp(103, "Kunal");
		emp e6 = new emp(103, "Kunal");
		emp e7 = new emp(103, "Kunal");
		emp e100 = new emp(103, "Kunal");
		
			
		//int b[]=new int[3];
		emp e[] = new emp[5];
		
		e[0] = e1;
		e[1] = e2;
		e[4] = e3;

		for(int i=0; i<5;i++)
		{
			//System.out.println(e[i]);
			System.out.println(e[i].empid);
			System.out.println(e[i].name);
			
		}
		
	}

}
