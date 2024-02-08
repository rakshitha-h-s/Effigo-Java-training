import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BrowserTest {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://google.com");
	try {
	driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("automation step by step");
	driver.findElement(By.cssSelector("input.gNO89b")).sendKeys(Keys.RETURN);
	}
	catch(Exception e){
		System.out.println("error");
	}
}
}
