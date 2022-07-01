package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates 
{
    public static void main(String[] args) 
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20}; //declaring array
		List<Integer> list = new ArrayList<>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20)); //converting array into array list
		System.out.println("List:" + list); //printing the list
		Set<Integer> hCheckSet = new LinkedHashSet<>(); //creating one set
	    Set<Integer> hTargetSet = new LinkedHashSet<>(); //creating another set
		for (Integer integer : list) //iterating over list to add values into integer variable
		{
	         if(!hCheckSet.add(integer)) //first set removes duplicate values
	         {
	            hTargetSet.add(integer); //removed duplicate values are added in second set
	            
	         }
	         
		}
		System.out.println("Duplicate integers in given list is/are " + hTargetSet); //printing the duplicate values
		//System.out.println("Duplicate integers in given list is/are " + hCheckSet);
	}
		
		
}