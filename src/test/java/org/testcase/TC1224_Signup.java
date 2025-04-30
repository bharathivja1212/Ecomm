package org.testcase;

import java.io.IOException;

import org.locators.Signup;
import org.refillable.CommonMethod;
import org.testng.annotations.Test;
import org.testpages.HomePage;

public class TC1224_Signup extends CommonMethod{
	
	HomePage hp=new HomePage();
	@Test
	public void test1() throws IOException {
		hp.signUp();

}
}