package inheritanceDemo;
					//subclasschildclass						//superclass/parentclass
public class newkid extends newparent {
	
	public void rutuja()
	{
		System.out.println("rutuja");
	}

	public static void main(String[] args) {
	
		
		newkid nk = new newkid();
		nk.newg();
		nk.rutuja();
		nk.newpa();
		nk.bhushan();
		nk.onemore();

		newparent np = new newparent();
		np.onemore();
		np.newpa();
	//	np.rutuja();
		
		// newkid nk1 = new newparent();
		newparent np2 = new newkid(); 
		
		np2.onemore();
		np2.newpa();
	
		
	}

	
	public void bhushan()
	{
		System.out.println("bhushan");
	}
}
