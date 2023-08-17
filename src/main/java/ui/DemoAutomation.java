package ui;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
	
	public static void main(String []args)
	{
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver","D:\\Library\\msedgedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		FirefoxDriver driver=new FirefoxDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.google.com");
		
	}
	
	
}
