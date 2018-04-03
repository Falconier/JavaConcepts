package javaconcepts;

public class Money_JacobBullin implements Comparable
{
	private String type;	//type of currency
	private double value;	//value of money
	
	public Money_JacobBullin(String moneyType, double val)
	{
		// Initialize the instance variables
		type = moneyType;
		value = val;

	}
	
	public int compareTo(Object obj)
	{
		// Create a compareTo() method to determine how to compare a Money object.
		// Use the value of the money to determine whether it is less than, equal, or 
		// greater than the other money
		int r = 0;
		Money_JacobBullin other = (Money_JacobBullin) obj;
		if(this.equals(other))
			r = 0;
		if(this.value < other.value)
			r = -1;
		if(this.value > other.value)
			r = 1;
		return r;
	}
	
	public boolean equals(Object obj)
	{
		Money_JacobBullin other = (Money_JacobBullin) obj;
		if (value == other.value)
			return true;
		return false;
	}
	
	public double getValue()
	{
		// get the value of the money
		return value;

	}
	
	public String getType()
	{
		// get the type of money
		return type;

	}
	
	public String toString()
	{
		// return the value of the money
		return "" + getType() + " amount: $" + getValue();

	}
}
