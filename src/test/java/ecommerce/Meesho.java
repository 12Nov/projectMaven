package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void meeshoTest() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(5000);
	  driver.close();
  }
}
