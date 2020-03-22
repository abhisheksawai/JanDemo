package collectionDemo;

public class twowheeler extends wheeler {
	
	public void two()
	{
		System.out.println("two");
	}

	public static void main(String[] args) {
		
		twowheeler tw = new twowheeler();
		wheeler w = new wheeler();
		//twowheeler tw1 =  (twowheeler) new wheeler();		// downcasting
		twowheeler tw4 =  new wheeler();		// downcasting
		
		wheeler tw2 = new twowheeler();  //upcasting
		//methods of parent class but not child
		tw1.wheel();
		tw1.two();
		
		System.out.println(tw2 instanceof wheeler );
		
		tw2.wheel();
		
	}
	
}
