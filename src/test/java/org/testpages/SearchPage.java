package org.testpages;

import java.io.IOException;

import org.locators.SearchProduct;
import org.refillable.CommonMethod;
import org.refillable.ExcelRead;

public class SearchPage extends CommonMethod{
	
	SearchProduct sp=new SearchProduct();
	ExcelRead er=new ExcelRead();
	public void searchPdct() throws IOException {
		sp.clickSearchBox().sendKeys("Redmi");
		sp.clickMagnifier().click();;
		
	}

}
