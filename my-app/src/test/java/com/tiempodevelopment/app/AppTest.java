package com.tiempodevelopment.app;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	  private int x = 2;
	  private int y = 3;
	  
	  public void testAddition() {
		    int z = x + y;
		    assertEquals(5, z);
	  }	
	  
	   public void testMultiply() {
	       double result= x * y;
	       assertTrue(result == 6);
	   }	  
}