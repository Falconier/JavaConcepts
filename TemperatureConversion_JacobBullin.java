package javaconcepts;

import java.util.Scanner;

public class TemperatureConversion_JacobBullin
{
	public static void tempConverter()
	{
		double farhenheit = 212;
		double celsius = 100;
		double kelvin = 373.15;
		Scanner in = new Scanner(System.in);
		Scanner fin = new Scanner(System.in);
		Scanner cin = new Scanner(System.in);
		Scanner kin = new Scanner(System.in);

		System.out.println("This converter currently supports conversions form the following:");
		System.out.println("farhenheit, celsius, kelvin");
		System.out.println("rankine is currently not supported");
		System.out.println("");
		System.out.print("What unit are you converting from (farhenheit 'f', celsius 'c', or kelvin 'k'): ");
		String unit = in.nextLine();
		if (unit.equals("F") || unit.equals("f") || unit.equals("farhenheit") || unit.equals("Farhenheit"))
		{
			System.out.print("Please enter the temperature: ");
			farhenheit = fin.nextDouble();
			celsius = (farhenheit - 32.0) * 5.0 / 9.0;
			kelvin = (celsius + 273.15);
		}
		else if (unit.equals("c") || unit.equals("C") || unit.equals("celsius") || unit.equals("Celsius"))
		{
			System.out.print("Please enter the temperature: ");
			celsius = cin.nextDouble();
			farhenheit = (celsius / (5.0 / 9.0)) + 32;
			kelvin = (celsius + 273.15);
		}
		else if (unit.equals("k") || unit.equals("K") || unit.equals("kelvin") || unit.equals("Kelvin"))
		{
			System.out.print("Please enter the temperature: ");
			kelvin = kin.nextDouble();
			celsius = (kelvin - 273.15);
			farhenheit = (celsius / (5.0 / 9.0)) + 32;
		}
		else if (!unit.equals("F") || !unit.equals("f") || !unit.equals("farhenheit") || !unit.equals("Farhenheit")
				|| !unit.equals("c") || !unit.equals("C") || !unit.equals("celsius") || !unit.equals("Celsius")
				|| !unit.equals("k") || !unit.equals("K") || !unit.equals("kelvin") || !unit.equals("Kelvin"))
		{
			tempConverter();
		}
		System.out.println(farhenheit + " F");
		System.out.println(celsius + " C");
		System.out.println(kelvin + " K");

		System.exit(0);
	}
	
	/**
	 * Converts farhenheit to celsius and kelvin
	 * 
	 * @return a double for the temperature in celsius and kelvin
	 */
	public static void convFarhenheit()
	{
		Scanner fin = new Scanner(System.in);
		double farhenheit = 212;
		double celsius = 100;
		double kelvin = 373.15;
		System.out.print("Please enter the farhenheit temperature: ");
		farhenheit = fin.nextDouble();
		celsius = (farhenheit - 32.0) * 5.0 / 9.0;
		kelvin = (celsius + 273.15);
		System.out.println(farhenheit + " F = ");
		System.out.println(celsius + " C");
		System.out.println(kelvin + " K");
	}

	public static void convCelsius()
	{
		Scanner cin = new Scanner(System.in);
		double farhenheit = 212;
		double celsius = 100;
		double kelvin = 373.15;
		System.out.print("Please enter the celsius temperature: ");
		celsius = cin.nextDouble();
		farhenheit = (celsius / (5.0 / 9.0)) + 32;
		kelvin = (celsius + 273.15);
		System.out.println(celsius + " C = ");
		System.out.println(farhenheit + " F");
		System.out.println(kelvin + " K");
	}

	public static void convKelvin()
	{
		Scanner kin = new Scanner(System.in);
		double farhenheit = 212;
		double celsius = 100;
		double kelvin = 373.15;
		System.out.print("Please enter the kelvin temperature: ");
		kelvin = kin.nextDouble();
		celsius = (kelvin - 273.15);
		farhenheit = (celsius / (5.0 / 9.0)) + 32;
		System.out.println(kelvin + " K = ");
		System.out.println(farhenheit + " F");
		System.out.println(celsius + " C");
	}
}
