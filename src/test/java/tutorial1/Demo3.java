package tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {
	
	
	@Test
	public void abc()
	{
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	

	@Test
	public void xyz()
	{
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
	}

	@Test
	public void pqr()
	{
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	

	@Test
	public void abcde()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
			
		
	}
	
	
	

}
