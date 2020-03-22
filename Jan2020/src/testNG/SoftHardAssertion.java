package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertion {
	
	@Test
	public void soft()   // soft assertion rest of the part will run but test case failed
	{	
			SoftAssert assertion = new SoftAssert();
			System.out.println("Test 1 started soft assert");
			assertion.assertEquals(12, 13);
			System.out.println("Test 1 Completed soft assert");
			assertion.assertAll();
	}

	@Test
	public void Hard() // rest of the part will not work
	{
		System.out.println("Test 2 started hard assert");
		Assert.assertEquals(12, 13);
		System.out.println("Test 2 completed hard assert");
	}
}

