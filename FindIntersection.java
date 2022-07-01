package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindIntersection 
{

	public static void main(String[] args) 
	{
		int[] arr = {3,2,11,4,6,7};	//declaring array1 
		int[] arr1 = {1,2,8,4,9,7}; //declaring array2
		List<Integer> list1 = new ArrayList<>(Arrays.asList(3,2,11,4,6,7)); //converting array to list
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,8,4,9,7)); //converting array to list
		System.out.println("list1: " + list1); //printing list1 
	    System.out.println("list2: " + list2); //printing list2
	    for(int i=0; i <list1.size();i++) // Using for loop to iterate over list1
		{
			for(int j=0; j< list2.size(); j++) // Using for loop to iterate over list2
			{    		
				if (list1.get(i)==list2.get(j)) //Checking if condition whether both list are equal or not
	    		{
					
					 list1.retainAll(list2); //Retrieving the common numbers from both list
	    		}
			}
		}
		System.out.println("Intersection:" + list1); //printing the list
	}

}
