package javaconcepts;

import java.util.ArrayList;
import java.text.*;   //Needed to format double numbers to 2 places

// This driver program should create a new Money object for each currency or coin
// in a cash register (from a penny to a twenty dollar bill).
// It should then initialize the cash register with some money and print out the 
// contents of the cash register.
//
public class CashRegisterTester_JacobBullin
{
	public static void main( String[] args )
	{
		DecimalFormat decFormat = new DecimalFormat("$0.00");

		// Set up all possible types of money from a penny to a twenty dollar bill - here are a few examples:
		Money_JacobBullin twentyDollars = new Money_JacobBullin("20 dollar bill",20.00);
		Money_JacobBullin tenDollars = new Money_JacobBullin("10 dollar bill",10.00);
		Money_JacobBullin fiveDollars = new Money_JacobBullin("5 dollar bill", 5.00);
		Money_JacobBullin oneDollars = new Money_JacobBullin("1 dollar bill", 1.00);
		Money_JacobBullin quarter = new Money_JacobBullin("quarter", .25);
		Money_JacobBullin dime = new Money_JacobBullin("dime", .1);
		Money_JacobBullin nickel = new Money_JacobBullin("nickel",.05);
		Money_JacobBullin penny = new Money_JacobBullin("penny",.01);

		// Initialize the cash register by sending it an array list of money (currency/coins)
		// You can set up a loop and populate the array list that way (possibly 10 of each currency or coin)

		ArrayList<Money_JacobBullin>  cash = new ArrayList<Money_JacobBullin>();  //This is the array list of money that needs to be populated
		//364.91
		cash.add(twentyDollars);
		cash.add(quarter);
		cash.add(oneDollars);
		cash.add(tenDollars);
		cash.add(dime);
		cash.add(quarter);




		CashRegister_JacobBullin register = new CashRegister_JacobBullin(cash);  //Instantiates the cash register with money.

		// Show what is in cash register
		System.out.println("\n"+"The cash register contains $"+register.getTotalMoneyInRegister()+" :");
		register.printAmountInRegister();	//Shows the amount of each currency
	}
}

