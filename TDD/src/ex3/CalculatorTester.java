package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTester {

        @Test
        public void testEmptyString()
        {
                  StringCalculator calc = new StringCalculator();
          int result = calc.Add("");
          assertEquals(result, 0);
        }
        
        @Test
    public void testOneNumber()
    {
           StringCalculator calc = new StringCalculator();
           int result = calc.Add("7");
           assertEquals(result, 7);
        }
        @Test
        public void testTwoNumbers()
        {
           StringCalculator calc = new StringCalculator();
           int result = calc.Add("5,5");
           assertEquals(result, 10);
    }
        
        @Test
    public void testNoLimitOnNumbers()
        {
            StringCalculator calc = new StringCalculator();
            int result = calc.Add("5,5,5");
            assertEquals(result, 15);
    }
        
        @Test
    public void testLinesInsteadOfCommas()
        {
            StringCalculator calc = new StringCalculator();
            int result = calc.Add("5,5\n5");
            assertEquals(result, 15);
    }
        
         @Test
     public void testSupportDifferentDelimiters()
         {
             StringCalculator calc = new StringCalculator();
             int result = calc.Add("//;\n5;5,5\n5");
             assertEquals(result,20);
     }

}