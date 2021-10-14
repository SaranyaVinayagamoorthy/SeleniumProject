package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenBasicProgram {

	
	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void LoginTest() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement UsernameField = driver.findElement(By.id("txtUsername"));
		UsernameField.sendKeys("Admin");

		WebElement PasswordField = driver.findElement(By.id("txtPassword"));
		PasswordField.sendKeys("admin123");

		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\'btnLogin\']"));
		LoginButton.click();
		Thread.sleep(3000);
		driver.close();

	}

}
