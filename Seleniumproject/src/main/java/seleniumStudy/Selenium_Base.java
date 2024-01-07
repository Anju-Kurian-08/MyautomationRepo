package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Base {

	public static void main(String[] args) {
		
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();// launch the browser
		driver.get("https://github.com/");// to navigate to a url
		String s=driver.getTitle();// will fetch the title of the page
		System.out.println(s); // to print the title of the page
		String s1=driver.getCurrentUrl();// to fetch the current web page url
		System.out.println(s1);
		String s2=driver.getPageSource();
		System.out.println(s2);
		driver.navigate().back();// to press the back button of browser
		driver.navigate().forward(); //to press the forward button of browser
		driver.navigate().refresh(); //to press the refresh button of browser
		driver.manage().window().maximize(); // to maximize the window
		driver.close(); // to close the window-currently focused windows
		driver.quit();//to close the browser window-closes all windows,kills the driver instance
		driver.manage().deleteAllCookies();//delete all cookies in the selenium opened all browser windows
		
	
	}

}
