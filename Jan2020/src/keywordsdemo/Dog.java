package keywordsdemo;

public class Dog extends Animal {
	
	public Dog()  
	{
		super();  // compiler going to call , if you write or not, should be the first line
		super.Animal();// animal method	
		System.out.println("dog defualt const");
		//super();
	}
	
	String color = "black";
	
	public void displaycolor()
	{		
		System.out.println("Jayanta");
		System.out.println(super.color);	
		super.Animal();
	}
	
	public void animal()
	{
		System.out.println("dog animal dog");
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();  //default const will get call automatically
	//	System.out.println(d.color);
		//d.displaycolor();
	//	d.animal();
		//super.animal();
				
	}
	

}
