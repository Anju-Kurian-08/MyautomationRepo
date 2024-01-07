package seleniumStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium_Assignment1 {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
WebElement entermsg=driver.findElement(By.id("single-input-field"));
entermsg.sendKeys("this is my assignment");
WebElement showmsg=driver.findElement(By.id("button-one"));
showmsg.click();
System.out.println(showmsg.getText());
WebElement enterA=driver.findElement(By.xpath("//input[@id='value-a']"));
enterA.sendKeys("12");
WebElement enterB=driver.findElement(By.xpath("//input[@id='value-b']"));
enterB.sendKeys("13");
WebElement gettotal=driver.findElement(By.id("button-two"));
gettotal.click();
System.out.println(gettotal.getText());
	}

}
