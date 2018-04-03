// Movie class:
// This assignment teaches you about OOP techniques.  Specifically, you will define constructors,
// instance variables, accessor methods, modifier methods, and the toString method.

package javaconcepts;

import static java.lang.System.*;

public class Movie_JacobBullin
{
	// Create private instance variables to store the information for a Movie
	private String	mName;
	private String	mRate;
	private int		mYear;
	private int		tNum;
	private int		outBox;
	private double	reP;

	// Create a constructor with paramters: movie name, rating, year, total quantity, and checkout quantity
	public Movie_JacobBullin(String nam, String rating, int year, double rentCost, int total, int out)
	{
		// nam = nam.toLowerCase();
		mName = nam;
		rating = rating.toLowerCase();
		mRate = rating;
		mYear = year;
		tNum = total;
		outBox = out;
		reP = rentCost;
	}

	// Create modifier methods for each instance variable
	public void setName(String nam)
	{
		mName = nam;
	}

	// Create accessor methods for each instance variable
	public String getName()
	{
		return mName;
	}

	public String getRating()
	{
		return mRate;
	}

	public int getYear()
	{
		return mYear;
	}

	protected void setRating(String rating)
	{
		mRate = rating.toLowerCase();
	}

	protected void setYear(int year)
	{
		mYear = year;
	}

	public double getRentCost()
	{
		return reP;
	}

	// public void

	// Create method to return the total number of copies that are available
	public int getTotalAvailable()
	{
		return tNum;
	}
	
	protected void checkMOut()
	{
		tNum -= 1;
		outBox += 1;
	}

	// Create a toString() method to return the string version of the movie.
	public String toString()
	{

		return "The movie \"" + getName() + "\" has a rating of " + getRating().toUpperCase() + " and there are "
				+ getTotalAvailable() + " available. The rental cost is $" + getRentCost();
	}
}