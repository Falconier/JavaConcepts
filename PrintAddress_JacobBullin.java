package javaconcepts;

import javax.swing.JOptionPane;

public class PrintAddress_JacobBullin
{

	public static void main(String[] args)
	{
		String first_name = JOptionPane.showInputDialog("Please enter your first name: ");
		String last_name = JOptionPane.showInputDialog("Please enter your last name: ");
		String st_address = JOptionPane
				.showInputDialog("Please enter your street address (do not put city, state or zipcode): ");
		String city = JOptionPane.showInputDialog("What city do you live in? ");
		String state = JOptionPane.showInputDialog("What state is " + city + " in? ");
		String zipcode = JOptionPane.showInputDialog("What is your zipcode? ");
		// String a =
		// JOptionPane.showInputDialog("Is this the correct address: " +
		// st_address + ", " + city + ", " + state + " " + zipcode);
		// if (a.equals("yes") || a.equals("Yes"))
		// {
		System.out.println("" + first_name + " " + last_name + "");
		System.out.println("" + st_address + "");
		System.out.println("" + city + ", " + state + " " + zipcode + "");
		JOptionPane.showMessageDialog(null, "Thank you " + first_name + " for entering your name and address.");
		System.exit(0);
		// }
		/*
		 * else if (a.equals("no") || a.equals("No"))
		 * {
		 * String st_address2 = JOptionPane
		 * .showInputDialog(
		 * "Please re-enter your street address (do not put city, state or zipcode): "
		 * );
		 * String city2 =
		 * JOptionPane.showInputDialog("What city do you live in? ");
		 * String state2 = JOptionPane.showInputDialog("What state is " + city2
		 * + " in? ");
		 * String zipcode2 =
		 * JOptionPane.showInputDialog("What is your zipcode? ");
		 * System.out.println("" + first_name + " " + last_name + "");
		 * System.out.println("" + st_address2 + "");
		 * System.out.println("" + city2 + ", " + state2 + " " + zipcode2 + "");
		 * JOptionPane.showMessageDialog(null, "Thank you " + first_name
		 * + " for entering your name and address.");
		 * System.exit(0);
		 * }
		 */
	}
}