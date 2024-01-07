package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforeAftersuite {
  @Test
  public void testcase1() {
	  System.out.println("heloo goodmorning");
  }
  @Test
  public void testcase2() {
	  System.out.println("heloo goodevening");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
