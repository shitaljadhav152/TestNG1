package first;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Select
{
	
	 @Test(groups= {"Smoke"})
	public void testcase10()
	{
		System.out.println("User successfully Select value from dropdown");
	}
	 
	
	 @Test(priority=8 )
	public void testcase11()
	{
		System.out.println("User successfully Select date from calender");
	}
	 
	 
    @Test(priority=9)
	public void result12()
	{
		System.out.println("All Test cases passed");
	}
    @Test(dependsOnMethods= {"result12"})
	public void l()
	{
		System.out.println("-------------------------------------------------------------------");
	}
    
    
    
  /*   @BeforeSuite
    public void beforeSuite()
    {
    	System.out.println("Before suite executed");
    }
     
      
      
      @AfterTest
      public void afterTest()
      {
     	 System.out.println("After test executed");
      }
      
       
       @AfterClass
       public void afterc()
       {
      	 System.out.println("After class executed");
       }
       @BeforeMethod
       public void beforeM()
       {
       	System.out.println("Before Method executed");
       }
        */
       
     
}
