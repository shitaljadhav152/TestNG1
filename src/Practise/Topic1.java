package Practise;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Topic1
{
	 @Test(groups= {"Regression"})
	public void launchB()
	{
		System.out.println("chrome Browser open");
	}
	 @Test(groups = {"Retest"})                   //    (dependsOnMethods= {"launchB"})
	public void openUrl()
	{
		System.out.println("url open");
	}
	 @Test(dependsOnMethods= {"openUrl"})
	public void openApp()
	{
		System.out.println("Application  open");
	}
	 @Test(dependsOnMethods= {"openApp"})
	public void enterU()
	{
		System.out.println("Username enter successfully");
	}
	 @Test(dependsOnMethods="enterU")
	public void enterP()
	{
		System.out.println("Password enter successfully");
	}
	 @Test(dependsOnMethods= {"enterP"})
	public void clickLogin()
	{
		System.out.println("Login  successfully");
	}
	 @Test(dependsOnMethods= {"clickLogin"})
	public void clickMyProfile()
	{
		System.out.println("My profile open successfully");
	}
	 @Test(dependsOnMethods= {"clickMyProfile"})
	public void clickManageAdd()
	{
		System.out.println("Open Addreess webapge");
	}
	 @Test(dependsOnMethods= {"clickManageAdd"})
	public void updateAdd()
	{
		System.out.println("update Address  successfully");
	}
	 @Test(dependsOnMethods= {"updateAdd"})
	public void validation()
	{
		System.out.println("Test Case Passed");
	}
	
	/* @AfterSuite
     public void afterSuite()
     {
    	 System.out.println("After Suite executed");
     }
*/
	

}
