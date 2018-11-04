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
	public void testResta() {
		Assert.assertEquals(2, calc.resta());
	}
	
	@Test
	public void testSuma() {
		Assert.assertEquals(4, calc.suma());
	}
	
	@Test
	public void testProd() {
		Assert.assertEquals(4, calc.producto());
	}
	
	@Test
	public void testDiv() {
		Assert.assertEquals(1, calc.cociente());
	}
}
