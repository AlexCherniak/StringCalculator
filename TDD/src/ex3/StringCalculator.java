package ex3;

public class StringCalculator {
    private int stToInt(String string)
    {
            return Integer.parseInt(string);
    }
    
    private int sumNumbers(String[] numbers)
    {
            int sum=0;
            for(int i=0;i<numbers.length;i++)
            {
                    sum+=stToInt(numbers[i]);
            }
            return sum;
    }
   
    public int Add(String string)
    {
            if(string.isEmpty())
                    return 0;
            String[] numbers = string.split("[,\n]");
             if(numbers.length == 1)
                     return stToInt(string);
            return sumNumbers(numbers);
    }

}