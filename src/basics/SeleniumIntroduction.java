package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String name = "rahul";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String password = getPassword(driver);
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        
        Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.partialLinkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[@class='reset-pwd-btn']")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String [] passwordArray = passwordText.split("'");
		String [] passwordArray2 = passwordArray[1].split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}

}
