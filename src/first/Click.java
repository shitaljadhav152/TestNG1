package first;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Click 
{

	
	@Test(groups= {"Smoke"})                                    //(priority=10 )
	public void testcase7()
	{
		System.out.println("User successfully click on Radio buttons");
	}
	
	 @Test(priority= 11)
	public void testcase8()
	{
		System.out.println("User successfully clicked on Check boxes");
	}
	
	 
	 @Test(priority=12)
	public void result9()
	{
		System.out.println("All Test cases passed");
	}
	 
	 @Test(dependsOnMethods= {"result9"})
		public void l()
		{
			System.out.println("---------------------------------------------------------------------------");
		}
	/* @AfterMethod
     public void afterM()
     {
    	 System.out.println("After Method executed");
     }*/
  

}
