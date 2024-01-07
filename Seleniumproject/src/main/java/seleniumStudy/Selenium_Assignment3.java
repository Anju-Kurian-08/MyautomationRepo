package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium_Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		WebElement dropdownmultiple=driver.findElement(By.id("multi-select-field"));
		Select select=new Select(dropdownmultiple);
	    select.selectByIndex(0);
		select.selectByIndex(1);
		//select.selectByValue("Red");
		//select.selectByVisibleText("Red");
		List<WebElement> selectedoption=select.getAllSelectedOptions();
		/*for(int i=0;i<selectedoption.size();i++)
		{
			System.out.println(selectedoption.get(i).getText());
		}*/
		for( WebElement s:selectedoption)
		{
			System.out.println(s.getText());
			
		}
		
		

		

		
	}

}
