package keywordsdemo;

public class TestFinalCheck2 extends FinalCheck2 {
	
	public void finalmethod()
	{
		System.out.println("final method from subclass again");
	}

	public static void main(String[] args) {
		
		TestFinalCheck2 tf = new TestFinalCheck2();
		tf.finalmethod();
		
	}

}
