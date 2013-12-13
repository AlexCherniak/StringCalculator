package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTester {
	@Test
	public void test() {
	}
	@Test
	public void addingEmptyStringReturns0() {
		StringCalculator calculator = new StringCalculator();
		int result= calculator.Add("");
		assertEquals(0,result);
	}
}
