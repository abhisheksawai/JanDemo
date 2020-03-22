package encapsulationDemo;

public class Student {
	
	private int roll;
	private int roi =2500;
	
	public void set(int r)
	{
		roll = r;
	}
	
	public int get()
	{
		return roll;
	}
	
	public int getROI()
	{
		return roi;
	}

}
