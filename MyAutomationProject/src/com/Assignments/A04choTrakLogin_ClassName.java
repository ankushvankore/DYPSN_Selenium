package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04choTrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("samiksha");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("samiksha123");
		WebElement loginBtn = driver.findElement(By.className("btn-primary"));
		loginBtn.click();
		
		WebElement errMsg = driver.findElement(By.id("lblMsg"));
		String msg = errMsg.getText();
		System.out.println("Error Message: " + msg);
		
		driver.close();
	}

}
