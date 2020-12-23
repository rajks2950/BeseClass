package org.baseclass.Baseclass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestBaseClass {

	public static void main(String[] args) {
		BaseClass bclass = new BaseClass();
		bclass.launchBrowser("chrome");
		bclass.getToUrl("https://www.flipkart.com/");
		
		bclass.currentUrl();
		
		WebElement cross = bclass.driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
		bclass.click(cross);
		
		WebElement searchbar = bclass.driver.findElement(By.name("q"));
		bclass.sendKey(searchbar, "mask");
		
		WebElement srchclik = bclass.driver.findElement(By.xpath("//button[@type='submit']"));
		bclass.click(srchclik);
		
		WebElement f = bclass.driver.findElement(By.xpath("//span[text()='RETRY']"));
		bclass.click(f);
		
		WebElement mask = bclass.driver.findElement(By.xpath("(//a[@class='_2rpwqI'])[1]"));
		bclass.click(mask);
		
		bclass.switchToWindow(1);
		
		WebElement delcode = bclass.driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
		bclass.sendKey(delcode, "521163");
		
		
		
		
	}

}
