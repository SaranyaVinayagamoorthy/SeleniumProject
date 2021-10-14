package com.maven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://google.com");
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("alert(Hello,Do not close me!')");
		Thread.sleep(3000);
		driver.quit();
		}

}
