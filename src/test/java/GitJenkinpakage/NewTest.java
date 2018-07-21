package GitJenkinpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System. setProperty("webdriver.chrome.driver", "C:\\Jenkins\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin/2.21.0");
	  driver.close();
  }
  
  
  @Test
  public void failtest() {
	  
	  Assert.fail();
  }
  
  @Test
  public void passtest() {
	  
	  System.out.println("I am passed test case");
  }
}
