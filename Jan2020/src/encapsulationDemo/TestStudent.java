package encapsulationDemo;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		//s.roll=100;
		//s.set(200);
		int getroll;
		
		
			s.set(300);
			getroll = s.get();
			System.out.println("roll no is "+getroll);			
			System.out.println(s.getROI());
			
	}

}
