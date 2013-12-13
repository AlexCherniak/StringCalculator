package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTester {
	@Test
	public void test() {
	//	fail("Not yet implemented");
	}
	
	@Test
	public void addingEmptyStringReturns0() {
		StringCalculator calculator = new StringCalculator();
		int result= calculator.addEmptyStringReturnZero("");
		assertEquals(0,result);
	}
	
	@Test
	public void OneNum()
	{

				StringCalculator calculator = new StringCalculator();
				int result= calculator.Add("7");
				assertEquals(7,result);
	}
	
	@Test
	 public void TwoNum()
	 {
		StringCalculator calculator = new StringCalculator();
		int result= calculator.Add("5,5");
		assertEquals(10,result);
	 }
}