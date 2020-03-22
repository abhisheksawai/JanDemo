package inheritanceDemo;

public class kid2 extends parent  {	
	
	public void job()
	{
		System.out.println("SE");
	}
public void shadi()
	{
		super.shadi();
		//super.property();
		System.out.println("GF/BF");
	}

	public static void main(String[] args) {		
		kid2 k = new kid2();
		k.shadi();		
	//	super.shadi();
	}
	
}
