package testng_package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic_Commands {
  @Test(priority = 3)
  public void testCase1() { //by default testexecution order is alphabetical order.we can prioritize the order
	  
	  System.out.println("testcase1 executed");
  }
  @Test (priority = 4)//basic command in testNG
  public void testCase2() {
	  
	  System.out.println("testcase2 executed");
  }
  @Test //if we donot provide for two tests,both will be by provided priority 0 by testng and follows alphabetical order
  // each testcase is considered as separate method
  public void testCase3()
  {
	  System.out.println("testcase3 executed");
  }
  @Test //if we donot give priority testng consider its priority as 0 and run it as first
  public void testCase4() {
	  
	  System.out.println("testcase4 executed");
  }
  @DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { 2, 3 }, { 5, 7 } ,{ 10, 12 } }; //usage:can be used in case of login using different set of username and password
	}
}

//testNG provides only html report
