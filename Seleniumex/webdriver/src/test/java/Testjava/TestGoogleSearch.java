package Testjava;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TestGoogleSearch {
	public static void main(String[] args) {
		testGoogleSearch();
	}
	public static void testGoogleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rakshita/eclipse-workspace/Seleniumex/webdriver/Drivers/chromedriver/chromedriver-win64/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https:google.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("APjFqb.gLFyf")));
		element.sendKeys("automation step by step");
	//	driver.findElement(By.id("input")).sendKeys("automation step by step");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Success");	
	}
}
