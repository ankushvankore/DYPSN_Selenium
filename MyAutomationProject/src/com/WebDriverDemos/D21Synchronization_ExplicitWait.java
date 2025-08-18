package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D21Synchronization_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
		
		WebElement chkBox = driver.findElement(By.id("dte"));
		
		System.out.println("Before");
		System.out.println("Enabled : " + chkBox.isEnabled());
		System.out.println("Selected: " + chkBox.isSelected());
		
		wait.until(ExpectedConditions.elementToBeClickable(chkBox)).click();
		
		System.out.println("After");
		System.out.println("Enabled : " + chkBox.isEnabled());
		System.out.println("Selected: " + chkBox.isSelected());
	}

}
