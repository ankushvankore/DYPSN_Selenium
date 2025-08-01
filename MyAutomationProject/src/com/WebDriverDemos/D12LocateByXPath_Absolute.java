package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12LocateByXPath_Absolute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys("123456780");
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button")).click();
	}

}
