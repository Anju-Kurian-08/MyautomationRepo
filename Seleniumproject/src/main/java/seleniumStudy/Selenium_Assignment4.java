package seleniumStudy;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement btnclick=driver.findElement(By.xpath("//button[@type='submit']"));
		btnclick.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10000));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/payrollapp/worker/index']")));
		WebElement worker=driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		worker.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-primary']")));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[@class='btn btn-primary']"), "Search"));
		WebElement search=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	
		WebElement delete=driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-trash']"));
		delete.click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		//wait.until(ExpectedConditions.textToBePresentInElement(search,"Search"));
		
		

	}

}
