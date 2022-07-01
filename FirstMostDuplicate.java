package week3.day2.assignment;

import java.util.HashMap;
import java.util.Map;

public class FirstMostDuplicate
{

	public static void main(String[] args)
	{
		
          String input = "abbaba"; //declaring array here
          Map<Character, Integer> map = new HashMap<>(); //Using hashmap to print in random order
          char str = input.charAt(0); //Returns the char value at thespecified index
          int count = 0;
          char[] charArray = input.toCharArray(); //converting string into character
          for(int i = 0;i< charArray.length; i++) //iterating using for loop till the character array length
          {
			
			   map.put(charArray[i], map.getOrDefault(charArray[i],0)+1);	//adding the value into map		
		       if(map.get(charArray[i])>count) //checking using if condition whether character array value is greater than 0
			  {
				str= charArray[i]; //storing the character array into str variable
				count=map.get(charArray[i]); //getting the character array value and storing in count variable
			  }
		  }
         System.out.println("Number of times" + " " + str + " " +  "occurs in string abbaba is" + " " +count);
         
	}

}
