package testng_package;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Study {
  @Test
  @Parameters({"parameter1","parameter2"}) //provide same name as provided in xml file
  public void testcase1(String s,int a) {
	  
	  System.out.println(s);
	  System.out.println(a);
  }
}
