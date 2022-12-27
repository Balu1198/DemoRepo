/*
 * @author Balaji
 * 
 */
package com.selenium_automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
    @Test
    public void test1() {
    	int a = 10;
    	int b = 'A';
    	int c = a+b;
    	System.out.print(c +" : "+ b+a);
    	Assert.assertFalse(c!=b+a, "a+b!=b+a");
    }
}
