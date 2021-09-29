package mavenseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {
	 public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harinis\\eclipse-workspace-selenium\\seleniumProject\\drivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");   
		try {
			WebElement uname = driver.findElement(By.id("txtUsern"));
			uname.sendKeys("Admin");
		}
		catch (NoSuchElementException e )
		{
			System.out.println("----------Locator is Invalid-------------");
		}
//		WebElement uname = driver.findElement(By.id("txtUsern")); //invalid locator
//		uname.sendKeys("Admin");
		Thread.sleep(2000);
	    WebElement passwd = driver.findElement(By.id("txtPassword"));
		passwd.sendKeys("admin123");
	    WebElement submit = driver.findElement(By.id("btnLogin"));
		submit.click();
		Thread.sleep(3000);		
		driver.quit();
	}
}
