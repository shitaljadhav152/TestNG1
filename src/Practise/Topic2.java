package Practise;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic2 
{
	 @Test(groups= {"Regression"})
	public void launchB()
	{
		System.out.println("chrome Browser open");
	}
	 @Test(priority=2)
	public void openUrl()
	{
		System.out.println("url open");
	}
	 @Test(priority=3)
	public void openApp()
	{
		System.out.println("Application  open");
	}
	 @Test(priority=4)
	public void enterU()
	{
		System.out.println("Username enter successfully");
	}
	 @Test(priority=5)
	public void enterP()
	{
		System.out.println("Password enter successfully");
	}
	 @Test(priority=6)
	public void clickLogin()
	{
		System.out.println("Login  successfully");
	}
	 @Test(priority=7)
	public void validation()
	{
		System.out.println("Test Case Passed");
	}
	 /*  @BeforeTest
	     public void beforeTest()
	     {
	     	System.out.println("Before test executed");
	     }
*/
}
