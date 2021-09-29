package mavenseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GA_demo_links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harinis\\eclipse-workspace-selenium\\seleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/svg"));
//		driver.findElement(By.linkText("Practice Form"));
//		driver.findElement(By.id("firstName")).sendKeys("Harini");
//		driver.findElement(By.partialLinkText("lastName")).sendKeys("Shanmugam");
		
	}
}
