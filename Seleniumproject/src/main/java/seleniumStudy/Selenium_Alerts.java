package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme.click();
		driver.switchTo().alert().accept();//to click ok button
		//driver.switchTo().alert().dismiss();//to click cancel button
		WebElement clickme2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2.click();
		String s=driver.switchTo().alert().getText();//get the text of the javascript of alert box
		System.out.println(s);
		driver.switchTo().alert().dismiss();//switchto is a method in webdriver interface

	}

}
