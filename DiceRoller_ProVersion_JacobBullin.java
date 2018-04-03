package javaconcepts;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller_ProVersion_JacobBullin
{
	public static String 	theResults	= "";
	public static Scanner	in			= new Scanner(System.in);
	public static int		numOfRolls	= 0;
	
	public DiceRoller_ProVersion_JacobBullin()
	{

	}

	public static void playGame()
	{
		numOfRolls = 1;
		while(numOfRolls < 4 && numOfRolls >= 1)
		{
			for (int a = 0; a < 4; a++)
			{
				theResults += (rollDice() + ", ");
			}
			theResults += rollDice();
			System.out.println(theResults);
			if(numOfRolls == 3)
			{
				break;
			}
			else if(numOfRolls < 3)
			{
				reRoll();
			}
		}
		
	}

	public static int rollDice()
	{
		Random r = new Random();
		return r.nextInt(6) + 1;
	}
	public static void reRoll()
	{
		System.out.println("Would you like to reroll? (y/n)");
		System.out.print("> ");
		String reroll = in.nextLine();
		if (reroll.equalsIgnoreCase("y") || reroll.equalsIgnoreCase("yes"))
		{
			numOfRolls += 1;
			theResults = "";
		}
		else if (reroll.equalsIgnoreCase("n") || reroll.equalsIgnoreCase("no"))
		{
			int b = 4 - numOfRolls;
			b += 1;
			numOfRolls += b;
		}
	}
}
