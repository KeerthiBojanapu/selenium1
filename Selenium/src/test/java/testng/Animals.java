package testng;

import org.testng.annotations.Test;

public class Animals {
	@Test(groups ="Animals",timeOut=1000)
	public void test1() throws Throwable
	{
		Thread.sleep(2000);
		System.out.println("Cat");
		
	}
	
	@Test(groups ="Animals")
	public void test2()
	{
		System.out.println("Lion");
	}
	
	@Test()
	public void test3()
	{
		System.out.println("Birds");
	}

}
