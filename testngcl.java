package testngr;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testngcl {
  @Test
  public void f() {
	  FirefoxDriver driver=new FirefoxDriver();
			  driver.get("http://google.com");
	  
  }
}
