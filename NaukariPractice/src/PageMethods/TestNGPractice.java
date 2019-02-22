package PageMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("BeforeSuit");
	}
	
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println(System.currentTimeMillis());
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforeTest");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("afterTest");
	}
	
	@Test(priority=1,description="this is test1")
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=3,description="this is test3")
	public void test3()
	{
		System.out.println("test3");
	}

}
