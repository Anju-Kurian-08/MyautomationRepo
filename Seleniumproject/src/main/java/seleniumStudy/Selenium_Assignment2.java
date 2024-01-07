package seleniumStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class Selenium_Assignment2 {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement radiobutton1=driver.findElement(By.cssSelector("input#inlineRadio1"));
		radiobutton1.click();
	    boolean s1=	radiobutton1.isSelected();
	    System.out.println(s1);
	    WebElement radiobutton2=driver.findElement(By.cssSelector("input#inlineRadio21"));
	    radiobutton2.click();
	    System.out.println(radiobutton2.isSelected());
	    WebElement radiobutton3=driver.findElement(By.cssSelector("input#inlineRadio23"));
	    radiobutton3.click();
	    System.out.println(radiobutton3.isSelected());
	    
	
	

	}

}
