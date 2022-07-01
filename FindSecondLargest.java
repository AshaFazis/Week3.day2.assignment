package week3.day2.assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest 
{

	public static void main(String[] args) 
	{
		 
		int[] data = {3,2,11,4,6,7}; //declaring array
		List<Integer> list = new ArrayList<>(Arrays.asList(3,2,11,4,6,7)); //converting array to list
		System.out.println("List:" +list); //printing the list
        Collections.sort(list); //sorting the list
        System.out.println("Sorted list:" +list); //printing the sorted list
        Integer integer = list.get(4); //getting the second largest number
        System.out.println("2nd element from last:" + integer); //printing the second largest number
	}

}
