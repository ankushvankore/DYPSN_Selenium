package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D17HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		//All the operations on Dropdown list can be done only via this Object
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>allCountries = countries.getOptions();
		System.out.println("Total Countries: " + allCountries.size());
		
		int i = 0;
		for(WebElement c : allCountries)
		{
			System.out.println(i + ". " + c.getText());
			i++;
		}
		//countries.selectByVisibleText("Nepal");
		//countries.selectByContainsVisibleText("Nep");
		//countries.selectByValue("148");
		countries.selectByIndex(145);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
	}

}
