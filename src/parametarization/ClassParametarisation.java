package parametarization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassParametarisation 
{
	@Test
	@Parameters("browser")
	public void testcase1(String name)
	{
		if(name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\TESTING\\required software\\selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://howtodoinjava.com//testng//testng-dependent-tests-examples//");
		} 
		else
		{
			System.setProperty("webdriver.gecko.driver","F:\\TESTING\\required software\\selenium\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://howtodoinjava.com//testng//testng-dependent-tests-examples//");
			
		}
	}

}
