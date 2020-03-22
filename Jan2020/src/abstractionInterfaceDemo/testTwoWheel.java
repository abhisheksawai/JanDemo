package abstractionInterfaceDemo;

public class testTwoWheel implements TwoWheel {

	public static void main(String[] args) {
		//TwoWheel t = new TwoWheel();

		testTwoWheel t = new testTwoWheel();
		t.color();
		t.engine();
		TwoWheel.t2();
				
	}


	public void color() {
	System.out.println("2 wheel color");
		
	}


	public void engine() {
		System.out.println("2 wheel engine");
		
	}

}
