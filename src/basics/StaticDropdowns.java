package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaticDropdowns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sreenidhirajakrishnan.com/practice#section-4");
		
		WebElement staticDrpdwn = driver.findElement(By.id("standard-select"));
		
		Select dropdown = new Select(staticDrpdwn);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		
		
		
		

	}

}
