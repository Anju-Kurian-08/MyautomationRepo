package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
        WebElement dropdown1=driver.findElement(By.id("single-input-field"));
        Select select =new Select(dropdown1);//Select is a class in selenium to handle dropdowns,Create an object for select and pass webelement as argument
       // select.selectByVisibleText("Red");//select by visible text
        //select.selectByIndex(2);//select by index
        select.selectByValue("Red");//select by value
      WebElement selectedvalue= select.getFirstSelectedOption();//returns webelment-to verify the selected option
      System.out.println(selectedvalue.getText());

	}

}
