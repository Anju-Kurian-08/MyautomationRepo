package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Beforeclass_Afterclass {
  @Test
  public void testcase1() {
	  System.out.println("testcase1 executed");
  }
  @Test
  public void testcase2() {
	  System.out.println("testcase2 executed");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
	  
  }

}
