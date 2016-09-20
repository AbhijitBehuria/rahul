package testngr;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gmail {
	 @Test
	 @BeforeMethod
	  public void f() 
	 {
	System.out.println("Before");	
		  FirefoxDriver driver=new FirefoxDriver();
				  driver.get("http://google.com");
				 			    
	}
	 
	 @AfterMethod
	 public void f1()
	 {
		 System.out.println("After");
	 }
	 


}
