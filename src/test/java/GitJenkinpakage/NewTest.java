package GitJenkinpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin/2.21.0");
	  driver.close();
  }
}
