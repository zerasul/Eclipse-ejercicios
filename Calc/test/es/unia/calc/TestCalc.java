package es.unia.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestCalc {

	private Calc calc;
	@Before
	public void setUp() {
		calc = new Calc(2,2);
	}
	@Test
	public void test() {
		Assert.assertEquals(2, calc.resta());
	}

}
