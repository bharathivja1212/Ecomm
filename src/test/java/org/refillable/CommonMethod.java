package org.refillable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethod {
	
	public static WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		System.out.println("Browser Launched");
		}

	public String getData(String input) throws IOException {
		FileInputStream i= new FileInputStream(".//data//credential.properties");
		Properties p=new Properties();
		p.load(i);
		String op=p.getProperty(input);
		return op;
		}
	
	public void passURL(String url) throws IOException {
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.location=\'"+url+"\'");
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("URL passed");
		takeSnap();
	}
	
	public void takeSnap() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		int sn = 1;
		FileUtils.copyFile(screenshotAs, new File(".//data//screen"+sn+".png"));
		sn++;
	}
	
	public void closeDriver() {
		driver.close();
		System.out.println("Browser closed");
	}
	
	public void jse_scrollUp() throws InterruptedException {
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
	}
	
	public void jse_scrollDown() throws InterruptedException{
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
	}
	
	public void alertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void jseClick(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public static void main(String[]args) {
	CommonMethod cm=new CommonMethod();
	cm.launchBrowser();
	}
}
