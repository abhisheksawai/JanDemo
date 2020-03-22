package inheritanceDemo;

public class child extends pa {
	
	public void c()
	{
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		child c = new child();
		c.c();
		c.paa();
		c.gp();
		
		// 9 comibination i ll write here
		
		//child c2 = new pa();
		//child c3 = new grandpa();
//		pa p1 = new pa();
//		p1.paa();
//		p1.gp();
//	//	p1.c();
//		pa p2 = new child(); //86
//		p2.gp();
//		p2.paa();
//		p2.c();
		
		//pa p3 = new grandpa();  //Type mismatch: cannot convert from grandpa to pa
//		grandpa g1 = new grandpa();
//		g1.gp();

		grandpa g2 = new child();
		g2.gp();
		
		grandpa g3 = new pa();
		g3.gp();
		
		
		
		
	}
	
}
