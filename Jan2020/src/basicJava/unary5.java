package basicJava;

public class unary5 {
	
	public static void main(String[] args) {		
		
		int num1 = 10;
		int num2;
		
		num2 = num1++;
		System.out.println(num2); //10
		System.out.println(num2++); //10
		System.out.println(num2); //11
		System.out.println(num1); //11
	}

}
