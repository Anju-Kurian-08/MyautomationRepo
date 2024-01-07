package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assignment6 {
	WebDriver driver;
  @Test
  public void verifyTextSendButton()  
	  {
			WebElement verifyit = driver.findElement(By.xpath("//a[@href='/payrollapp/site/request-password-reset']"));
			// String actual=verifyit.getText();
			verifyit.click();
			String expected = "SEND";
			WebElement sendtext = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
			String actual = sendtext.getText();
			Assert.assertEquals(actual, expected);
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
