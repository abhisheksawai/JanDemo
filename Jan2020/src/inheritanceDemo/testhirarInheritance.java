package inheritanceDemo;

public class testhirarInheritance {

	public static void main(String[] args) {
	
		dog d = new dog();
		cat c = new cat();
		
		d.bark();
		d.sleep();
		
		c.mew();
		c.sleep();
		
		//dog d3 = new animal();
		//cat c4 = new animal();
		animal c6 = new cat();
		c6.sleep();
		
		//dog d1 = new cat();
		//cat c2 = new dog();
	}

}
