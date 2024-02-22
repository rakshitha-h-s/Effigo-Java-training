import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/** sign in to github account**/
public class GitHubLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("login_field"));
		if (username.isDisplayed()) {
			if (username.isEnabled()) {
                 username.sendKeys("rakshitha");
                 String enteredText = username.getAttribute("value");
				Thread.sleep(3000);
				 username.sendKeys("-h-s");
				 Thread.sleep(3000);
			} else 
				System.out.println("Not Enabled");

		}WebElement password=driver.findElement(By.id("password"));
		if(password.isDisplayed()) {
			if(password.isEnabled()) {
				password.sendKeys("raksh");
				String enteredpass=password.getAttribute("value");
				Thread.sleep(3000);
				password.sendKeys("@28");
				Thread.sleep(3000);		
			}
         WebElement click=driver.findElement(By.name("commit"));
         click.click();
         Thread.sleep(5000);
		}
		System.out.println("Logged in successfully");
		driver.close();
	}
}
