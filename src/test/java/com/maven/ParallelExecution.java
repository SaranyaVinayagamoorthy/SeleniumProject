package com.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Test
	public void OpenGoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saranyavm\\eclipse-workspace\\SaranyaSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void OpenBing() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saranyavm\\eclipse-workspace\\SaranyaSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.bing.com/");
		Thread.sleep(3000);

}
}
