package basicJava;

public class forloopDemo5 {

	public static void main(String[] args) {
		
		for(int i=1; i <=3 ; i++)
		{
			System.out.println("i->"+i);
			for(int j =1 ;j <=3 ;j ++)
			{
				//System.out.println("j-> " +j);
				if(j==2)
				{
					break;
				}
				System.out.println("j-> " +j);
			}
		}
		
		
	}

}
