package com.tiempodevelopment.app;

import java.util.ArrayList;

import org.junit.Test;

public class AppTest {
	
	@Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
	  int i = 1/0;
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
	    ArrayList emptyList = new ArrayList();
	    Object o = emptyList.get(0);
	}
	
    @Test(expected = IllegalArgumentException.class)
    public void testExpected()
    {
       throw new IllegalArgumentException();
    }
	
	
}
