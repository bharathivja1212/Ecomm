package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.refillable.CommonMethod;

public class Signup extends CommonMethod {
	
	
    public WebElement signinBox() {
	WebElement signIn=driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
	return signIn;
	}
    
    public WebElement enterMobileNo() {
    	WebElement enterNo=driver.findElement(By.name("email"));
    	return enterNo;
    	}
    
    public WebElement clickCnt() {
    	WebElement cc=driver.findElement(By.xpath("//input[@type='submit']"));
    	return cc;
    	}
    
    public WebElement clickPswdBox() {
    	WebElement cpb=driver.findElement(By.name("password"));
    	return cpb;
    	}
    
    
    public WebElement clickSignIn() {
    	WebElement csi=driver.findElement(By.id("signInSubmit"));
    	return csi;
    	}
}
