package abstractionInterfaceDemo;

public class TestfourWheeler extends FourWheeler {
	
	public void glass() {
		System.out.println("glass fun");
	}
	public void substaction()
	{
		System.out.println("substraction fun- child");
	}
	public void enginetype()
	{
		System.out.println("engine fun");
	}
	
	public static void main(String[] args) {
		
		TestfourWheeler tf = new TestfourWheeler();
		tf.substaction();
		tf.glass();
		tf.enginetype();
		tf.withdraw();
		
		//FourWheeler f = new FourWheeler();
		
	}

	public void withdraw() {
	
		System.out.println("withdraw fun");
		
	}

}
