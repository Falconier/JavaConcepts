package javaconcepts;

import static java.lang.System.*;

public class ChickenCounterTester
{
	public static void main(String args[])
	{
		ChickenCounter_JacobBullin counter = new ChickenCounter_JacobBullin();
		
		System.out.println(counter.countChickens("itatfun"));
		
		System.out.println(counter.countChickens("itatchickenfun"));
		
		System.out.println(counter.countChickens("chchickchickenenicken"));	
			
		System.out.println(counter.countChickens("chickchickfun"));;	
	
		System.out.println(counter.countChickens("chickenbouncetheballchicken"));		
		

		//pass the word to search for to the object

		counter = new ChickenCounter_JacobBullin("java");

		System.out.println("");

		System.out.println(counter.countChickens("jjajavavaavaisfun"));		

		System.out.println(counter.countChickens("I want some jajavava"));		
		
	}
}