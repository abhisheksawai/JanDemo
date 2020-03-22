package abstractionInterfaceDemo;

import accessModifiersDemo.am2;

public class TestMulitpleInheritance implements two,three,one {
	
	public void o1() {	
		System.out.println("o1");
	}
	public void o2() {
		System.out.println("o2");
	}
	public void t31() {
		System.out.println("t31");
	}
	public void t32() {
		System.out.println("t32");
	}
	public void t21() {
		System.out.println("t21");
	}
	public void t22() {
		System.out.println("t22");
	}
	
	public static void main(String[] args) {
		TestMulitpleInheritance tm = new TestMulitpleInheritance();
		tm.o1();
		tm.o2();
		tm.t21();
		tm.t22();
		tm.t31();
		tm.t32();
		
		am2 a = new am2();
		a.m1();
	}
	

}
