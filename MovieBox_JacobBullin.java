package javaconcepts;

import java.util.ArrayList;

// The MovieBox class represents a kiosk that stores movies.
public class MovieBox_JacobBullin
{
	private ArrayList<Movie_JacobBullin>	movies	= new ArrayList<Movie_JacobBullin>();

	// Create a constructor method that accepts an array list of movies
	public MovieBox_JacobBullin(ArrayList<Movie_JacobBullin> movieList)
	{
		movies = movieList;
	}

	// Create a method that accepts a rating and returns all of the movies that have that rating.
	// If the rating parameter is ALL then return all of the movies
	public ArrayList<Movie_JacobBullin> findMoviesByRating(String rating)
	{
		ArrayList<Movie_JacobBullin> findRate = new ArrayList<Movie_JacobBullin>();

		if (rating.equalsIgnoreCase("pg") || rating.equalsIgnoreCase("pg13") || rating.equalsIgnoreCase("r")
				|| rating.equalsIgnoreCase("g") || rating.equalsIgnoreCase("nr"))
		{
			for(int i = 0; i < movies.size(); i++)
			{
				if (movies.get(i).getRating().equalsIgnoreCase(rating))
				{
					findRate.add(movies.get(i));
				}
			}
		}
		else
		{
			System.out.println("There are no movies with the rating \"" + rating + "\"");
		}
		return findRate;
	}
	
	public Movie_JacobBullin checkOut(String movieNam)
	{
		Movie_JacobBullin a = null;
		
		for(int i = 0; i < movies.size(); i++)
		{
			if(movies.get(i).getName().equalsIgnoreCase(movieNam))
			{
				movies.get(i).checkMOut();
				a = movies.get(i);
			}
		}
		
		return a;
	}
	
	
	
	/*private ArrayList<Movie_JacobBullin> queCheck()
	{
		
	}*/

}
