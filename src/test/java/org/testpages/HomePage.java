package org.testpages;

import java.io.IOException;

import org.locators.Signup;
import org.refillable.CommonMethod;

public class HomePage extends CommonMethod{
	
Signup su=new Signup();
	
	public void signUp() throws IOException {
		su.signinBox().click();
		su.enterMobileNo().sendKeys(getData("unumber"));
		su.clickCnt();
		su.clickPswdBox().sendKeys(getData("pwd"));
		su.clickSignIn();
	}

}
