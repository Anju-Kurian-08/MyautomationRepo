package testng_package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic_Dataprovider {

	/*@DataProvider(name = "data-provider") //can create multiple dataprovider within the same class by changing the name and dpmethod.
	public Object[][] dpMethod() {
		return new Object[][] { { 2, 3 }, { 5, 7 } ,{ 10, 12 } }; //usage:can be used in case of login using different set of username and password
	}*/

	@Test(dataProvider = "data-provider",dataProviderClass = Basic_Commands.class)// can be called from another class also
	public void testcase1(int a,int b) {
		System.out.println("dataprovider study");
		int c=a+b;
		System.out.println(c);
	}
}
