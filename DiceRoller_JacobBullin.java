package javaconcepts;

import java.util.Random;
import java.util.Scanner;

// DiceRoller allows the user to roll 5 dice and decide how many dice to roll again.  
// The dice can be rolled 3 times.
public class DiceRoller_JacobBullin
{
	public static String	theResults	= "";
	public static Scanner	in			= new Scanner(System.in);

	public DiceRoller_JacobBullin() // Constructor
	{
		// Nothing needed in this constructor
	}

	public static void playGame()
	{
		rollTheDie();
	}

	public static int rollDice()
	{
		Random r = new Random();
		return r.nextInt(6) + 1;
	}

	public static void rollTheDie()
	{
		for (int a = 0; a < 4; a++)
		{
			theResults += (rollDice() + ", ");
		}
		theResults += rollDice();
		System.out.println(theResults);
		reRoll();
	}

	public static void reRoll()
	{
		// Scanner in = new Scanner(System.in);
		System.out.println("Would you like to reroll? (y/n)");
		System.out.print("> ");
		String reroll = in.nextLine();
		if (reroll.equalsIgnoreCase("y") || reroll.equalsIgnoreCase("yes"))
		{
			reRollStep2();
		}
		else if (reroll.equalsIgnoreCase("n") || reroll.equalsIgnoreCase("no"))
		{
			quit();
		}
	}

	public static void reRollStep2()
	{
		System.out.println("How many dice are you rerolling?");
		System.out.print("> ");
		int numOfDice = in.nextInt();
		in.nextLine();
		theResults = "";
		if (numOfDice > 5)
		{
			System.out.println("You only have 5 die to roll, not " + numOfDice + " to roll.");
			System.out.println("Setting the number of dice to reroll to 5...");
			numOfDice = 5;
		}
		for (int a = 0; a < (numOfDice - 1); a++)
		{
			theResults += (rollDice() + ", ");
		}
		theResults += rollDice();
		System.out.println(theResults);
		reRoll2();
	}

	public static void reRoll2()
	{
		System.out.println("Would you like to reroll? (y/n)");
		System.out.print("> ");
		String reroll2 = in.nextLine();
		if (reroll2.equalsIgnoreCase("y") || reroll2.equalsIgnoreCase("yes"))
		{
			reRollStep3();
		}
		else if (reroll2.equalsIgnoreCase("n") || reroll2.equalsIgnoreCase("no"))
		{
			quit();
		}
	}

	public static void reRollStep3()
	{
		System.out.println("!!! THIS IS THE LAST REROLL THAT YOU HAVE !!!");
		System.out.println("How many dice are you rerolling?");
		System.out.print("> ");
		int numOfDice = in.nextInt();
		in.nextLine();
		theResults = "";
		if (numOfDice > 5)
		{
			System.out.println("You only have 5 die to roll, not " + numOfDice + " to roll.");
			System.out.println("Setting the number of dice to reroll to 5...");
			numOfDice = 5;
		}

		for (int a = 0; a < (numOfDice - 1); a++)
		{
			theResults += (rollDice() + ", ");
		}
		theResults += rollDice();
		System.out.println(theResults);
		playAgain();
	}

	public static void playAgain()
	{
		System.out.println("Would you like to play again? (y/n)");
		System.out.print("> ");
		String playagain = in.nextLine();
		if (playagain.equalsIgnoreCase("y") || playagain.equalsIgnoreCase("yes"))
		{
			playGame();
		}
		else if (playagain.equalsIgnoreCase("n") || playagain.equalsIgnoreCase("no"))
		{
			System.out.println("Thank you for playing.");
			System.exit(0);
		}
	}
a
	public static void quit()
	{
		System.out.println("Are you sure that you want to quit? (y/n)");
		System.out.print("> ");
		String quit = in.nextLine();
		if (quit.equalsIgnoreCase("y") || quit.equalsIgnoreCase("yes"))
		{
			System.out.println("Thank you for playing.");
			System.exit(0);
		}
		else if (quit.equalsIgnoreCase("n") || quit.equalsIgnoreCase("no"))
		{
			theResults = "";
			playGame();
		}
	}

}