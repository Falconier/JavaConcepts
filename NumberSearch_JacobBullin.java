package javaconcepts;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import static java.lang.System.*;

public class NumberSearch_JacobBullin
{
	private int[] numArray;

	public NumberSearch_JacobBullin(String[] list)	// What type of method is this?
	{
		numArray=new int[list.length];
		// Loop through the String array and copy elements to the integer array		
		for(int i = 0; i < numArray.length; i++)
		{
			numArray[i] = Integer.parseInt(list[i]);
		}

	}
	
	public void sortNumArray()
	{
		Arrays.sort(numArray);

	}
	
	public int getNextLargest(int searchNum)
	{
		// This method should search the array for the first number
		// that is greater than the search number.  If the search number is
		// greater than every number in the array, then return -1.
		// Hint: make sure that the array is sorted first.
		
		int min = searchNum;
		int count = 0;
		while(count<numArray.length)
		{
			if(min < numArray[count])
				break;
			else
			{
				count++;
			}
		}
		if(count<numArray.length)
			return numArray[count];
		else
			return -1;
		
	}

	public String toString()
	{
		String output="";
		// Loop through the array and put spaces between the values (keep concatenating to variable output)
		int i = 0;
		while(i<numArray.length)
		{
			output += "" + numArray[i] + " ";
			i++;
		}


		return output;
	}
}