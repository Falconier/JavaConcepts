package javaconcepts;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MovieTester_JacobBullin
{

	public static void main(String[] args)
	{
		ArrayList<Movie_JacobBullin> movies = new ArrayList<Movie_JacobBullin>();
		movies.add(new Movie_JacobBullin("Gone with the Wind", "PG", 1940, 1.00, 10, 3));
		movies.add(new Movie_JacobBullin("The Terminator", "PG13", 1984, 1.00, 10, 1));
		movies.add(new Movie_JacobBullin("Animal House", "PG13", 1978, 1.00, 20, 0));
		movies.add(new Movie_JacobBullin("Shrek", "G", 2001, 1.00, 10, 6));
		movies.add(new Movie_JacobBullin("Interstellar", "PG13", 2014, 2.00, 15, 10));
		// Add at least 5 movies to the array list
		// Example: movies.add(new Movie("Gone with the Wind", "PG", 1940, 1.00, 10, 3));

		// Instantiate a MovieBox object and pass it the list of movies
		MovieBox_JacobBullin box = new MovieBox_JacobBullin(movies);

		// Instantiate an array list of the movies that have a certain rating
		ArrayList<Movie_JacobBullin> moviesByRating = new ArrayList<Movie_JacobBullin>();

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the rating that you would like to search: ");
		String rate = in.nextLine();
		moviesByRating = box.findMoviesByRating(rate);
		System.out.print(moviesByRating);

		/*System.out.println("Would you like to check out a movie or continue searching? (check out or search)");
		String ans = in.nextLine();
		if (ans.equalsIgnoreCase("check out"))
		{
			System.out.println("Please enter the name of the movie you would like to check out: ");
			String movieName = in.nextLine();
			box.checkOut(movieName);
		}
		else
		{
			System.out.println(" f ");
		}*/

		// Prompt for the movie rating and pass this as a parameter to your new method in the MovieBox class

		// Loop through the array list of movies and print each movie's name, rating, and availability to the console.
		// Remember to use the accessor methods that you have created in the Movie class.

	}

}
