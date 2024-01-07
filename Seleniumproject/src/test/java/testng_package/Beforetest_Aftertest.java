package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Beforetest_Aftertest {
  @Test
  public void testcase1() {
	  System.out.println("testcase1 executed");
  }
  
  @Test
  public void testcase2() {
	  System.out.println("testcase2 executed");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
