package javaconcepts;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class InterestRate_JacobBullin
{
	private static String			theItem;
	private static Double			interestRate;
	private static Double			totalInterest;
	private static Double			itemPrice;
	private static Double			firstPayment;
	private static DecimalFormat	money	= new DecimalFormat("###,###,##0.00");

	public static void thePurchase()
	{
		theItem = JOptionPane.showInputDialog("What are you purchasing?");
		String thePrice = JOptionPane.showInputDialog("How much does the item cost?");
		itemPrice = Double.parseDouble(thePrice);
		String theRate = JOptionPane.showInputDialog("What is the monthly interest rate for your purchase?");
		interestRate = Double.parseDouble(theRate);
		totalInterest = interestRate;
		interestRate = interestRate / 100;
		calculate();
	}

	private static void calculate()
	{
		firstPayment = itemPrice * interestRate;
		displayPurchase();
	}

	private static void displayPurchase()
	{
		System.out.println("You purchased the following: " + "\"" + theItem + "\" for $" + itemPrice + ".");
		System.out.println("Your monthly interest rate is " + totalInterest + "%.");
		System.out.println("You will be charged $" + money.format(firstPayment) + " in interest after the first month.");
	}
}
