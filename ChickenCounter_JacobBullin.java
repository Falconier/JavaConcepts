package javaconcepts;

// The countChicken() method should count the number of occurrences of the word chicken (or some other word) in the string passed to it.
// Use recursion to accomplish this (countChicken() should call itself whenever "chicken" is found).
// Make this class flexible by passing the word you want to search for as a parameter to the constructor.  If
// nothing is passed to the constructor (there is no parameter), then the search word should be "chicken".

import static java.lang.System.*;

public class ChickenCounter_JacobBullin
{
	private String	search		= "";
	private int		numFound	= 0;

	// Create two constructor methods here, one with no parameter and one with one parameter
	public ChickenCounter_JacobBullin()
	{
		search = "chicken";
	}

	public ChickenCounter_JacobBullin(String searchWord)
	{
		search = searchWord;
	}

	// The parameter bigString below should contain the long string that you want to find the word chicken in
	/*
	 * private int contains(String s)
	 * {
	 * }
	 */

	public int countChickens(String bigString)
	{
		String temp1 = "";
		String temp2 = "";
		
		bigString = bigString.toLowerCase();

		if (bigString.contains(search))
		{
			int indx = bigString.indexOf(search);
			//numFound += 1;
			temp1 = bigString.substring(0, indx);
			temp2 = bigString.substring(indx + search.length(), bigString.length());
			bigString = temp1 + temp2;
			return countChickens(bigString) + 1;
		}
		else if(!bigString.contains(search) || bigString.length() == 0)
		{
			return 0;
		}
		else
		{
			return 0;
		}
	}
}