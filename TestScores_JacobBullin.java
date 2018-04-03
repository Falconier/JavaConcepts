package javaconcepts;

import javax.swing.JOptionPane;

public class TestScores_JacobBullin
{
	int[]	a		= new int[10];
	int		count	= 0;

	public void inputScores()
	{
		count = 0;
		while (count < 10)
		{
			String score = JOptionPane.showInputDialog("What is the score (enter 999 to stop)");
			int indevScore = Integer.parseInt(score);
			if (indevScore == 999)
				break;
			else if (indevScore > 110)
			{
				JOptionPane.showMessageDialog(null,
						"The maximum score that can be entered is 110. Please enter an acceptable score.");
				count--;
			}
			else
			{
				a[count] = indevScore;
				count++;
			}
		}
	}

	public void processScores()
	{
		for (int i = 0; i < count; i++)
		{
			if (i == count - 1)
			{
				System.out.println("" + a[i]);
				break;
			}
			System.out.print("" + a[i] + ", ");
		}

		int maxScore = a[0];

		int minScore = a[0];

		for (int j = 0; j < count; j++)
		{
			if (a[j] > maxScore)
				maxScore = a[j];

			if (a[j] < minScore)
				minScore = a[j];
		}

		System.out.println("");
		System.out.println("The lowest score was: " + minScore);
		System.out.println("The highest score was: " + maxScore);

		double sum = 0;

		for (int k = 0; k < count; k++)
		{
			sum += a[k];
		}

		double average = sum / count;

		System.out.println("Your average test score is: " + average);
	}
}