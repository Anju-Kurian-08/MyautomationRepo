package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Keyboadmouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		//mouseevents
		Actions actions=new Actions(driver);//actions class used to handle keyboard actions
		//actions.doubleClick().perform();// double click anywhere in screen. example of method overloading,same function name with different parameters
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(doubleclick).perform(); //double click in the element, perform mandatory in this case
		//actions.contextClick().perform();//rightclick anywhere in screen
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightclick).perform();
		actions.moveToElement(rightclick).perform();//mousehover
		//keyboard events
		actions.sendKeys(Keys.ARROW_DOWN).perform();//to perform keyboard actions(to press keyboard keys), Keys is the static class used to handle keyboard actions,so no need to create objects to invoke methods
		
		
		
	}

}
