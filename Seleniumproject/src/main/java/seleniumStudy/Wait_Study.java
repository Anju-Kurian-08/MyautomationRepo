package seleniumStudy;

import java.time.Duration;
import org.openqa.selenium.By;
import java.util.function.Function; 
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;

public class Wait_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		//implicitwait-implicit wait is general,will wait for maximum time.if page loads before provided time,in the next fraction of seconds will continue execution
		//only once needed to be added at the beginning
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("loginform-username"));
		WebElement password=driver.findElement(By.id("loginform-password"));
		username.sendKeys("carol");
		password.sendKeys("1q2w3e4r");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();//redirecting from loginpage to homepage
		//there is a delay in loading homepage elements to complete the background process.selenium tries to find the element before loading and fails to locate the element
		//we can resolve this issues using wait
		
		//explicit wait:element specific,more detailed, makes wait the driver until the element is loaded
		//provided just before the line where unwanted failure occurs
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10000));
		//if it takes few seconds to load an alert
		//wait.until(ExpectedConditions.alertIsPresent());
		
		//if it takes a few seconds to load a frame
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("")));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/payrollapp/client/index']")));
		WebElement clients=driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
		clients.click();
		
	
		
		//fluent wait
	/*Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))//wait for 5 sec and check whether element is present or not and then wait for next 5 seconds
			       //checks for the element presence in each provided interval
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait1.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });*/
	}

}
