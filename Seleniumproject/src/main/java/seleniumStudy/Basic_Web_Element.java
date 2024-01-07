package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Web_Element {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.id("loginform-username"));
		username.sendKeys("anjukurian08");//to enter values to the webelement
		username.clear();//to clear the datas in text field
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));//xpath of password field
		password.sendKeys("123456");//reference variable.sendkeys to input to textfield
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();//to click the element
		String s=loginbutton.getText();//return the text in the element as string value
		System.out.println(s);
		String s1=loginbutton.getTagName();//return element's tagname as string
		System.out.println(s1);
		System.out.println(username.getTagName());
		System.out.println(loginbutton.getAttribute("class"));//to fetch the attribute value from html,returns as string,here will return class attribute value
		System.out.println(loginbutton.getCssValue("background-color"));
		System.out.println(loginbutton.getCssValue("font-family"));
		//System.out.println(loginbutton.);
		//input#loginform-username-->cssselector of username field
		//input[id=loginform-username]-->cssselector of username field

	}

}
