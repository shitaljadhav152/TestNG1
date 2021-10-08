package first;

import org.testng.annotations.Test;

public class EnterText 
{
	
	 @Test(groups= {"Smoke"})                             //(priority=4 )
	public void testcase4()
	{
		System.out.println("successfully enter text for username");
	}
     
	 @Test(priority= 5)
	public void testcase5()
	{
		System.out.println("Successfully enter text for password");
	}
     
	 @Test(priority= 6)
	public void result6()
	{
		System.out.println("All Test cases are passed");
	}
	 @Test(dependsOnMethods= {"result6"})
		public void l()
		{
			System.out.println("-------------------------------------------------------------------");
		}

}
