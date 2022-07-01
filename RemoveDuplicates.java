package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String text = "We learn java basics as part of java sessions in java week1";	//Getting input string
		String[] split = text.split(" "); //splitting each words using split method and converting into String array
		for (String string : split) //Using for each loop to traverse through all the words in String
		{
			System.out.println(string);
		}
		
		//System.out.println("Array:" + Arrays.toString(split)); //creating an array for String 
		List<String> list = new ArrayList<>(Arrays.asList(split)); //convert array to list
		System.out.println("List:" + list);
		Set<String> set = new LinkedHashSet<>(list); //Removing duplicates using set interface
		System.out.println("Set:" + set);
		
	}

}
