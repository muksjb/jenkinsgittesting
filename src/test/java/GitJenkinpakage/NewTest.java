package GitJenkinpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System. setProperty("webdriver.chrome.driver", "C:\\Jenkins\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin/2.21.0");
	  driver.close();
  }
}
