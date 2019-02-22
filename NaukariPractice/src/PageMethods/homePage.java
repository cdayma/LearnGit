package PageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.reUsableMethods;

public class homePage {
	
	@Test(enabled=false)
	public void searchJobs()
	{
			WebDriverWait wait=new WebDriverWait(reUsableMethods.driver,15);
			WebElement pageElement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"Walk-in Jobs\"]")));
			Assert.assertTrue(pageElement.isDisplayed());
		}
	
	@Test(enabled=false)
	public void starPattern() {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	@Test(priority=2,description="this is test2")
	public void test1()
	{
		System.out.println("test2");
	}
	
	@Test(enabled=false)
	public void printTriagle()
    { 
        // outer loop to handle number of rows 
        //  n in this case 
        for (int i=0; i<5; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=5-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
    } 
	
	
	@Test(enabled=false)
	public void learnStar()
	{
	int i, j; 
	  
    for(i=1; i<=5; i++) 
    { 

        for(j=1; j<=i; j--) 
        { 
           
            System.out.print("* "); 
        } 
       
        System.out.println(); 
    } 
	}
} 
	
	
	



