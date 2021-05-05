package com.TestMaximum;
import org.junit.Assert;
import org.junit.Test;
public class FindMaximumTest {
	
	@Test
	public void maximumIntegerAtPosition1() {
		Assert.assertSame(12, new FindMaximum(3,4,12).maximum());
	}
	

	
} 