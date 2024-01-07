package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Radibtns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.cssSelector("input#gridCheck"));//to find the element
		checkbox1.click();//click the element
		boolean value=checkbox1.isSelected();//verify whether the checkbox is selected
		System.out.println(value);//print the boolean value

	}

}
