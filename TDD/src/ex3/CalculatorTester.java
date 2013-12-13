package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTester {

        StringCalculator calculator = new StringCalculator();
        @Test
        public void test() {
                //fail("Not yet implemented");
        }
        
        @Test
        public void addingEmptyStringReturns0() 
        {
                int result= calculator.Add("");
                assertEquals(0,result);
        }
        
        @Test
        public void JustOneNumber() 
        {
                int result= calculator.Add("7");
                assertEquals(7,result);
        }
        
        @Test
        public void addTwoNumbers() 
        {
                int result= calculator.Add("5,5");
                assertEquals(10,result);
        }
        
        @Test
        public void addNoLimitNumbers() 
        {
                int result= calculator.Add("5,5,5");
                assertEquals(15,result);
        }

        @Test
        public void newLinesBetweenNumbers() 
        {
                int result= calculator.Add("5,5\n5");
                assertEquals(15,result);
        }

}