package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Grouping_Study {
  @Test
  public void testcase1() {
	  System.out.println("testcase1 executed");
  }
  @Test
  public void testcase2() {
	  System.out.println("testcase2 executed");
  }
  @Test(groups ={"critical"})
  public void testcase3() {
	  System.out.println("testcase3 executed");
  }
  @Test(groups ={"critical"})
  public void testcase4() {
	  System.out.println("testcase4 executed");
  }
  @Test(groups = {"smoketest"})
  public void testcase5() {
	  System.out.println("testcase5 executed");
  }
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() {
	  System.out.println("beforemethod executed");
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
	  System.out.println("aftermethod executed");
  }

}
