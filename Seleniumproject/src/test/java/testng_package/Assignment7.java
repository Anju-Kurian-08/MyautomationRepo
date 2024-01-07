package testng_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	WebDriver driver;

	@DataProvider(name = "data-provider") 
	public Object[][] dpMethod() {
		return new Object[][] { { "carol1", "1q2w3e4r" }, { "carol2", "1q2w3e4r2" }, { "carol3", "1q2w3e4r4" } }; 
	}

	@Test(dataProvider = "data-provider")
	public void verifyLoginWithInvalidCredentials(String a, String b) {

		WebElement username = driver.findElement(By.id("loginform-username"));
		WebElement password = driver.findElement(By.id("loginform-password"));
		username.sendKeys(a);
		password.sendKeys(b);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement message = driver.findElement(By.xpath("//p[text()='Incorrect username or password.']"));
		if (message.isDisplayed() == true) {
			System.out.println("login failed,enter the valid credentials");
		} else {
			System.out.println("logined successfully");
		}

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
