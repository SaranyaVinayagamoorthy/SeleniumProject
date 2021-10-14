package com.maven;

import org.testng.annotations.Test;

public class SkipATestCase {
	
	@Test(priority = 0)
	public void StartTheCar()
	{
		System.out.println("Please Start the Car ");
	}
	
	@Test(priority = 5)
	public void StartTheMusic()
	{
		System.out.println("Please StartTheMusic ");
	}
	
	@Test(priority = 1,enabled = false)
	public void PutFirstGear()
	{
		System.out.println("FirstGear ");
	}
	
	@Test(priority = 2)
	public void PutSecondGear()
	{
		System.out.println("Please PutSecondGear ");
	}
	
	@Test(priority = 3)
	public void PutThirdGear()
	{
		System.out.println("Please PutThirdGear ");
	}
	
	@Test(priority = 4)
	public void PutFourthGear()
	{
		System.out.println("Please PutFourthGear ");
	}
}
