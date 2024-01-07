package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Annotations_Study {
	//annotations are pre and post conditional methods
	
	
  @Test
  public void testcase1() {
	  
	  System.out.println("testcase1");
	
	  
  }
  
  @Test
  public void testcase2() {
	  
	  System.out.println("testcase2");
	
	  
  }
  
  @BeforeClass
  public void beforeClass()
  {
	 System.out.println("beforeclass"); 
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }
 
  /*@BeforeMethod
  //common initialization methods that is applicable for all testcases will be added in before method
  //control will move to before method before testcase execution
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  //control will move to after method after testcase execution
  public void afterMethod() {
	  System.out.println("after method");
  }*/

}
