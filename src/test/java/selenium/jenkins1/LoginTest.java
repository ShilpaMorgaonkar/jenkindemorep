package selenium.jenkins1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void LoginTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  System.out.println("current title is " + driver.getTitle());
	  
  }
}
