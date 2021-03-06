package Org1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHq 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("java",Keys.ENTER);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("testng",Keys.ENTER);
	}
}


