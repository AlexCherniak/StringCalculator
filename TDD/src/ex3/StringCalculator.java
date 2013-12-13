package ex3;


public class StringCalculator {
	int addEmptyStringReturnZero(String numbers)
	{
		return 0;
	}	
	int Add(String input)
	{
		{
			String[] numbers = input.split(",");
			if((input)=="")
				return 0;
			else if(input.length() == 1)
			 {
				 return  Integer.parseInt(numbers[0]);
			 }
			else
			{
				return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[0]);
			}		
		}
	}
}