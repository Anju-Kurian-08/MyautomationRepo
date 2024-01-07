package seleniumStudy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newtab=driver.findElement(By.id("tabButton"));
		newtab.click();
		String parentwindow=driver.getWindowHandle();// returns current(parent) window id as string
		//System.out.println(parentwindow);
		Set<String> allwindows=driver.getWindowHandles();//returns all the opened windows id,stores in set of string,contains parent windoow and sub window ids
		//System.out.println(allwindows);
		for(String str:allwindows)//to iterate the collection
		{
			if(!str.equals(parentwindow))
			{
				driver.switchTo().window(str);//to switch to second window
				WebElement sampletext=driver.findElement(By.id("sampleHeading"));
				String s=sampletext.getText();
				System.out.println(s);
				//interact with all the child windows elements
			}
		}
		driver.switchTo().window(parentwindow);//switch to parent window
	}

}
