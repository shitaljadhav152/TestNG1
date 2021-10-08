package first;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login
{
	
	 @Test (enabled=false)
	public void testcase1()
	{
		System.out.println("Login with valid credentials");
	}
	 
	 @Test(enabled=false)//(groups= {"Retest"})//(priority= 2)
	public void testcase2()
	{
		System.out.println("Login with Invalid credentials");
	}
	 
	 
	 @Test(timeOut=5000)//(priority= 3)
	public void result()
	{
		System.out.println("all test cases are passed");
	}

	 @Test//(dependsOnMethods= {"result"})
		public void l()
		{
			System.out.println("-------------------------------------------------------------------");
		}
	/* @BeforeClass
     public void beforeClass()
     {
     	System.out.println("Before class executed");
     }*/
}
