package seleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		// store the value of unique column in a list of webelements
		List<WebElement> uniquecolumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//td[1]"));
		String locator = null;
		// iterate the list using forloop
		for (int i = 0; i < uniquecolumn.size(); i++) {
		// match the element row using if condition
			if (uniquecolumn.get(i).getText().equals("Ashton Cox")) {
				locator = "//table[@id='dtBasicExample']//tbody//tr[" + (i + 1) + "]//td[3]";
				break;

			}
		}
		WebElement reqvalue = driver.findElement(By.xpath(locator));
		System.out.println(reqvalue.getText());

	}

}
