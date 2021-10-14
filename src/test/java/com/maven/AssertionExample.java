package com.maven;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionExample {
String name= "Saranya";
boolean value = true;
 
@Test
public void CheckEqual()
{
	Assert.assertTrue(value, "This is true");
}

}
