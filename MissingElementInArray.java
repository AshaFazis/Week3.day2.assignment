package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElementInArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,7,6,8}; //declaring array 
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,7,6,8)); //converting array into list
		System.out.println("List:" + list); //printing the list
		Collections.sort(list); //sorting the list
		System.out.println("Sorted list:" + list); //printing the sorted list
		List<Integer> list1 = new ArrayList<>(list); //creating another list
		System.out.println("Size of list:"+ list.size()); //getting the size of first list
		for(int i = 1; i<= list.size(); i++) //iterate over for loop till size of first list
		{
			   if (!list.contains(i)) //checking if list contains i
			   {
			      list1.add(i); //if exists adding value into list1
			      System.out.println("Missing number:" +i);
			      System.out.println("Missing element in list appended at last:" + list1);
			     
			   }
		}
		Collections.sort(list1); //sorting the second list
		System.out.println("Sorted with missing number:" + list1); //sorted list with number 5 added
		
	}

}