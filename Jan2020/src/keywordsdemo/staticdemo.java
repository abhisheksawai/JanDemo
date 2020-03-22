package keywordsdemo;

public class staticdemo {
	
	static int counter=10;
	
	public staticdemo()   //defualt const
	{
		counter++;
		System.out.println(counter);  //11
	}
	
	public static void main(String[] args) {
		
		staticdemo sd1 = new staticdemo();  //11
		staticdemo sd2 = new staticdemo();
		staticdemo sd3 = new staticdemo();
			
	}

}
