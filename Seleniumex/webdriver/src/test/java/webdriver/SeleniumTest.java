package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakshita\\eclipse-workspace\\Seleniumex\\webdriver\\Drivers\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-extensions");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		  try {
	            // Explicitly wait for the element to be present
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("fake-editable")));

	            // Now you can interact with the element
	            // For example, you can click on it
	            element.sendKeys("automation step by step");
	        } catch (Exception e) {
	            // Handle NoSuchElementException or TimeoutException
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
		/*WebElement element=driver.findElement(By.id("voiceSearchButton"));
		element.click();*/
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        //WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("truncate")));
		
	}

}
