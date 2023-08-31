package Hookable;

import org.testng.annotations.Test;

public class annotation {
	@Test(alwaysRun = true)
	public void test1()
	{
		System.out.println("Welcome to india");
	}
	@Test
	public void test2()
	{
		System.out.println("Hello world");
	}

}
