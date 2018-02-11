package com.basic;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EvenOrOddTest {
	EvenOrOdd eoo;
	int num;
    String expected;
	@Before
	public void setUp() throws Exception {
		eoo = new EvenOrOdd();
		//num = 10;
	}
	
	

	public EvenOrOddTest(int num, String expected) {
		super();
		this.num = num;
		this.expected = expected;
	}



	@After
	public void tearDown() throws Exception {
	}

    @Parameterized.Parameters
	public static Collection parameters() {
		return Arrays.asList(new Object[][] { { 2, "Even" }, { 3, "Odd" }, { 4, "Even" }, { 5, "Odd" } });
	}

	@Test
	public void testIsEvenOrOdd() {
		String mesg = eoo.isEvenOrOdd(num);
		Assert.assertEquals(expected, mesg);
		// fail("Not yet implemented");
	}

}
