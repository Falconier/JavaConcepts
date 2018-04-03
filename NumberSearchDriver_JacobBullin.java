package javaconcepts;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearchDriver_JacobBullin
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("NumberSearchData.txt"));  // Put file in the project folder
		int size = file.nextInt();  // Reads the first line for the number of data sets in the file
		file.nextLine();            // Necessary to read the linefeed

		for(int i = 0; i<size; i++) // Loop through each data set in the file
		{
			String sent = file.nextLine();  // Reads the line of integer values
           		String[] listOfNumbers = sent.split(" ");	// The split method will create a String array
			NumberSearch_JacobBullin ns = new NumberSearch_JacobBullin(listOfNumbers);  // Construct a new NumberSearch object
			int findNum = file.nextInt();  // Read the following line for the number to search for
 		   	System.out.println("Unsorted array: "+ns);		// Print unsorted array
 		   	ns.sortNumArray();								// Sort the array
 		   	System.out.println("Sorted array:   "+ns);		// Print the sorted array

 		   	// Print out a statement about the value in the array with the next largest value than the search number.
			// See the instructions for the format of this statement


  			file.nextLine();   // Necessary to read the linefeed
		}
	}
}



