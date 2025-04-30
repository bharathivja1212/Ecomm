package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.refillable.CommonMethod;

public class SearchProduct extends CommonMethod{
	
	public WebElement clickSearchBox() {
		WebElement csb=driver.findElement(By.id("twotabsearchtextbox"));
		return csb;
		}
	    
	    public WebElement clickMagnifier() {
	    	WebElement cm=driver.findElement(By.xpath("//input[@value='Go']"));
	    	return cm;
	    	}

}
