package javaconcepts;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.text.*; //Needed to format double numbers to 2 places

// Create a CashRegister class that represents the cash register and its contents.  The CashRegister class 
// will keep track of the different currency and coins in the cash register.  You need a method to 
// tell you what money is in the cash register.
//
public class CashRegister_JacobBullin
{
	// Create instance variables to keep track of the money (each currency/coin) in the cash register,
	// the money (each currency/coin) received,
	// and the purchase amount

	private ArrayList<Money_JacobBullin>	money		= new ArrayList<Money_JacobBullin>();	// This keeps track of all the money in the register

	private DecimalFormat					moneyFormat	= new DecimalFormat("$0.00");			// Money format: 2 decimals with $
	private DecimalFormat					decFormat	= new DecimalFormat("#.##");			// Decimal format: 2 decimals

	public CashRegister_JacobBullin(ArrayList<Money_JacobBullin> startMoney)
	{
		// This is the constructor. The array list parameter is full of Money objects. Since the money
		// needs to be separated, You will also need to sort the money array list in reverse order.
		// This ArrayList can be sorted since Money implements Comparable and and the compareTo method is defined
		money = startMoney;
		Collections.sort(money);
		Collections.reverse(money);

	}

	public double getTotalMoneyInRegister()
	{
		// Calculate the total amount of money in the cash register
		int count = 0;
		double amount = 0.00;

		while (count < money.size())
		{
			amount += money.get(count).getValue();
			count++;
		}

		return amount;

	}

	public void printAmountInRegister()
	{
		// Print out the total amount of each currency in the cash register. There should be a separate line per currency.
		
		ArrayList<Money_JacobBullin> money2 = new ArrayList<Money_JacobBullin>();
		int idx = 0;
		while(idx<money.size())
		{
			money2.add(money.get(idx));
			idx++;
		}
		//System.out.println(money);
		//System.out.println("The cash register contains " + getTotalMoneyInRegister());

		ArrayList<Money_JacobBullin> twenties = new ArrayList<Money_JacobBullin>(), tens = new ArrayList<Money_JacobBullin>(), fives = new ArrayList<Money_JacobBullin>(), ones = new ArrayList<Money_JacobBullin>();
		ArrayList<Money_JacobBullin> quarters = new ArrayList<Money_JacobBullin>(), dimes = new ArrayList<Money_JacobBullin>(), nickels = new ArrayList<Money_JacobBullin>(), pennies = new ArrayList<Money_JacobBullin>();
		
		int count = 0;
		while(count<money.size())
		{
			//count++;
			if(money.size() == 0)
			{
				break;
			}
			
			else if(money.get(count).getValue() == 20.00)
			{
				twenties.add(money.remove(count));
				//count--;
			}
			else if(money.get(count).getValue() == 10.00)
			{
				tens.add(money.remove(count));
				//count--;
			}
			else if(money.get(count).getValue() == 5.00)
			{
				fives.add(money.remove(count));
				//count--;
			}
			else if(money.get(count).getValue() == 1.00)
			{
				ones.add(money.remove(count));
				//count--;
			}
			else if(money.get(count).getValue() == 0.25)
			{
				quarters.add(money.remove(count));
				//count--;
			}
			else if(money.get(count).getValue() == 0.10)
			{
				dimes.add(money.remove(count));
				//count--;
			}
			else if(money.get(count).getValue() == 0.05)
			{
				nickels.add(money.remove(count));
				//count--;
			}
			else if(money.get(count).getValue() == 0.01)
			{
				pennies.add(money.remove(count));
				//count--;
			}
		}
		
		System.out.println("There are " + twenties.size() + " twenties in the register : " + (twenties.size() * 20.00));
		System.out.println("There are " + tens.size() + " tens in the register : " + (tens.size() * 10.00));
		System.out.println("There are " + fives.size() + " fives in the register : " + (fives.size() * 5.00));
		System.out.println("There are " + ones.size() + " ones in the register : " + (ones.size() * 1.00));
		System.out.println("There are " + quarters.size() + " quarters in the register : " + (quarters.size() * .25));
		System.out.println("There are " + dimes.size() + " dimes in the register : " + (dimes.size() * .10));
		System.out.println("There are " + nickels.size() + " nickels in the register : " + (nickels.size() * .05));
		System.out.println("There are " + pennies.size() + " pennies in the register : " + (pennies.size() * .01));
		
		idx = 0;
		while(idx<money2.size())
		{
			money.add(money2.get(idx));
			idx++;
		}
		
		money2.clear();
		System.out.println(money);
	}
}
