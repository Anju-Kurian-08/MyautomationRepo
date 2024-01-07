package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assignment_Groupingexclude {
	WebDriver driver;
   @Test
	    public void verifyTextSendButton() {
		WebElement verifyit = driver.findElement(By.xpath("//a[@href='/payrollapp/site/request-password-reset']"));
		// String actual=verifyit.getText();
		verifyit.click();
		String expected = "SEND";
		WebElement sendtext = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		String actual = sendtext.getText();
		Assert.assertEquals(actual, expected,"send button is not as expected");//if failed will print the message
	}

	@Test
	public void verifyTextSearchButton() {
		WebElement username = driver.findElement(By.id("loginform-username"));
		WebElement password = driver.findElement(By.id("loginform-password"));
		username.sendKeys("carol");
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		WebElement worker = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		worker.click();
		String expected = "Search";
		WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		String actual = search.getText();
		Assert.assertEquals(actual, expected);// hard assertion
		
		//hard assertion-will terminate when asertion fails
		//soft assertion-will not terminate,will execute up to last
		
		//SoftAssert softassert=new SoftAssert();
		//softassert.assertEquals(actual, expected,"failed");
		//System.out.println("testing************");
		//softassert.assertAll(); //consolidate the output

	}

	@Test(groups = {"regression"})
	public void verifyBackgroundcolorResetButton() {
		WebElement username = driver.findElement(By.id("loginform-username"));
		WebElement password = driver.findElement(By.id("loginform-password"));
		username.sendKeys("carol");
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		WebElement worker = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		worker.click();
		WebElement reset = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		String coloractual = reset.getCssValue("background-color");
		String colorexpected = "rgba(255, 255, 255, 1)";
		Assert.assertEquals(coloractual, colorexpected);
	}
  @Test(groups = {"sanitytest"})
	public void verifyTitleDropdown() {
		WebElement username = driver.findElement(By.id("loginform-username"));
		WebElement password = driver.findElement(By.id("loginform-password"));
		username.sendKeys("carol");
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		WebElement worker = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		worker.click();
		WebElement createworker = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/create']"));
		createworker.click();
		WebElement dropdown = driver.findElement(By.id("worker-title"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		WebElement selectedvalue = select.getFirstSelectedOption();
		String expectedvalue = selectedvalue.getText();

		String actualvalue = "Mr";
		Assert.assertEquals(actualvalue, expectedvalue);

	}


@BeforeMethod(alwaysRun = true)
public void beforeMethod() {
	   driver= new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

}

@AfterMethod(alwaysRun =  true)
public void afterMethod() {
	  driver.quit();
}

}

  


