package com.maven;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
@Test 
	public void HighSchool()
	{
		System.out.println("High school");
	}

@Test (dependsOnMethods = "HighSchool")
	public void HigherSecondarySchool()
	{
		System.out.println("HigherSecondarySchool");
	}

@Test (dependsOnMethods = "HigherSecondarySchool")
	public void Engineering()
	{
		System.out.println("College");
	}
	
}
