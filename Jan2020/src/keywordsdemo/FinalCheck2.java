package keywordsdemo;

final public class FinalCheck2 {
	
	public void finalmethod()
	{
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		
		int charges=100;  // we havenot use final keyword here
		System.out.println(charges);
		charges = 200;
		System.out.println(charges);
		
		final int newcharge = 300; // this is final
		System.out.println(newcharge);
	//	newcharge = 400;
		//final int newcharge = 3001;
		//final int newcharge = 3002;
		final int newcharge1 = 3003;
		final int newcharge2 = 3004;
		
	}

}
