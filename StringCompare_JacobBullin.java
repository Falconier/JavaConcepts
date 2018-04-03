package javaconcepts;

import java.util.Scanner;

public class StringCompare_JacobBullin
{
	public static String	sentenceOne	= "";
	public static String	findThis	= "";
	public static Scanner	in			= new Scanner(System.in);
	public static int		thePos;

	public static void run()
	{
		inputLevelOne();
	}

	public static void inputLevelOne()
	{
		System.out.println("Please type a sentence or a phrase below:");
		System.out.print("> ");
		sentenceOne += in.nextLine();
		System.out.println(sentenceOne);
		System.out.println("The length of what you entered is: " + sentenceOne.length());
		searchString();
	}

	public static void searchString()
	{
		System.out
				.println("Please enter a letter (character), phrase, or any combination of the two that you would like to search for:");
		System.out.print("> ");
		findThis += in.nextLine();
		System.out.println(findThis);
		System.out.println("The length of what you are searching for is: " + findThis.length());
		System.out.println("");
		System.out.println("Searching ...");
		pause();
	}

	private static void pause()
	{
		for (int a = 0; a < 30000; a++)
		{
		}
		searchReturn();
	}

	public static void searchReturn()
	{
		thePos = sentenceOne.indexOf(findThis);
		System.out.println("");
		System.out.println("The search has found that ..." + findThis + "... is first found at position " + thePos);
		if (sentenceOne.equalsIgnoreCase(findThis))
		{
			System.out.println("The first entry and second entry are the same.");
		}
		System.out.println("The first entry and second entry are not the same.");
		printFirstWord();
	}

	public static void printFirstWord()
	{
		int firstSpace = sentenceOne.indexOf(" ");
		String theFirstWord = sentenceOne.substring(0, firstSpace);
		System.out.println("");
		System.out.println("The first word in the original sentence was: " + theFirstWord);
		findThisAnyMore();
	}

	public static void findThisAnyMore()
	{
		int howManyRepeats = 1;
		while (true)
		{
			thePos = sentenceOne.indexOf(findThis, thePos + 1);
			if (thePos == -1)
			{
				break;
			}
			else if (thePos >= 1)
			{
				howManyRepeats += 1;
			}
		}
		if (howManyRepeats == 1)
		{
			System.out.println("The search entry occurres " + howManyRepeats + " time in the original sentence.");
		}
		System.out.println("The search entry occurres " + howManyRepeats + " times in the original sentence.");
		howManyWordsInSentence();
	}
	
	public static void howManyWordsInSentence()
	{
		int numWords = 0;
		int spacePos = -1;
		while(true)
		{
			spacePos = sentenceOne.indexOf(" ", spacePos + 1);
			if (spacePos == -1)
			{
				if(numWords == 0)
				{
					numWords += 1;
				}
				else if (numWords > 1)
				{
					numWords += 1;
				}
				break;
			}
			else if (spacePos >= 1)
			{
				numWords += 1;
			}
		}
		System.out.println("There are " + numWords + " words in the original sentence.");
	}
}
