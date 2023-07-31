package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TataNeu {
  @Test
  public void tataNeuTest() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.tatadigital.com/");
	 
	  Thread.sleep(5000);
	  driver.close();
  }
}
