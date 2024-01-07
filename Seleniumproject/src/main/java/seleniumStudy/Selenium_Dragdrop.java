package seleniumStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/drag-drop.php");
		driver.manage().window().maximize();
		WebElement sourceelement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement targetelement=driver.findElement(By.id("mydropzone"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(sourceelement, targetelement).perform();// to perform drag and drop, pass the source element and target element

	}

}
