package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sauce-demo.myshopify.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.id("customer_email")).sendKeys("user@sauce.com");
		driver.findElement(By.cssSelector(".long.password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@class='button']")).click();

	}

}
