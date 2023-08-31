package testng;

import org.testng.annotations.Test;

public class test1 {
	@Test(priority=1, description = "login functionality is completed")
	public void login()
	{
		System.out.println("Login functionality");
		
	}

    @Test(priority=2,description = "cart functionality is completed")
    public void cart()
    {
    	System.out.println("cart functionality");
    }
    @Test(priority=3,description = "payment functionality is completed")
    public void payment()
    {
    	System.out.println("payment functionality");
    }
}
