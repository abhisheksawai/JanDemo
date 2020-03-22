package inheritanceDemo;

public class kid extends parent  {	
	
	public void job()
	{
		//super.shadi();
		System.out.println("SE");
	}
public void shadi()
	{
		super.shadi();
		System.out.println("GF/BF");
	}

	public static void main(String[] args) {		
	//	kid k = new kid();
//		k.property();
	//	k.shadi();
    	//k.job();				
		parent p = new parent();
		p.shadi();
		
		parent p1 = new kid();
		p1.property();
				
		//super.shadi();
	}
	
}
