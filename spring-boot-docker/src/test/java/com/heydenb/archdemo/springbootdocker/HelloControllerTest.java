package com.heydenb.archdemo.springbootdocker;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HelloControllerTest{
	
	@Test
	public void testHello(){
		HelloController hc = new HelloController();
		assertEquals("Hello Docker World", hc.home());
	}
	
}
