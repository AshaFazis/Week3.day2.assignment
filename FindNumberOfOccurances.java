package week3.day2.assignment;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances 
{

	public static void main(String[] args) 
	{

      int[] arr = {2,3,5,6,3,2,1,4,2,1,6,-1}; //declaring array
      Map<Integer, Integer> map = new TreeMap<>(); //Using treemap to print in ascending order
      for (Integer eachNumber : arr)  //Iterating over array to get the numbers in map
      {
    	  if(map.containsKey(eachNumber)) //checking if map holds the key value 
    	  {
    		  map.put(eachNumber, map.get(eachNumber)+1); //if condition exists, map will add all numbers along with occurances of eachNumber
    	  }
    	  else
    	  {
    		  map.put(eachNumber, 1); //else key will have value as only 1
    	  }
	  }
      System.out.println(map);
	
	}

}
