package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class accessDropDown {
@Test

	public void AccessDropdown()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver11 = new ChromeDriver();
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		driver11.get(baseURL);

		Select drpCountry = new Select(driver11.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver11.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver11.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
	}

}
