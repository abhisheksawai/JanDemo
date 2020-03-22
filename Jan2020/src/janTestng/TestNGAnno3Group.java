package janTestng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnno3Group {
	
	//before grup
	@BeforeGroups
	public void beforegroup()
	{
		System.out.println("before group");
	}
	
	@AfterGroups
	public void aftergroup()
	{
		System.out.println("after group");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@Test
	public void TestCase1()
	{
		System.out.println("TC01");
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("TC02");
	}

	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after mthd");
	}
	

	

	
}
