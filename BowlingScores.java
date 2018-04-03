package javaconcepts;

// BowlingScores is used to practice using parallel arrays and 2-dimensional arrays

public class BowlingScores
{
	String[]	names			=
								{ "Rocky", "Striker", "Alley Cat", "Splitster", "Crusher", "Spare Bear" };
	int[][]		scores			=
								{
								{ 155, 190, 180, 120 },
								{ 95, 92, 100, 103 },
								{ 200, 175, 223, 202 },
								{ 105, 75, 80, 92 },
								{ 122, 140, 161, 110 },
								{ 90, 100, 130, 135 } };

	int[][]		minMaxScores;
	int			minScore		= 0;
	int			maxScore		= 0;
	String		maxScoreBowler	= "";
	String		minScoreBowler	= "";
	double		sum				= 0.0;
	double[]	averages		= new double[6];

	public void printScores()
	{
		for (int row = 0; row < scores.length; row++)
		{
			System.out.print(names[row] + " bowled games of ");
			for (int col = 0; col < scores[row].length; col++)
			{
				if (col == scores[row].length - 1)
				{
					System.out.print(scores[row][col] + ".");
					break;
				}
				System.out.print(scores[row][col] + ", ");
			}
			System.out.println("");
		}

		minmaxScoreArray();
		overAllMax();
		overAllMin();

		System.out.println("");
		System.out.println("" + maxScoreBowler + " had the highest overall score. That score was: " + maxScore);
		System.out.println("" + minScoreBowler + " had the lowest overall score. That score was: " + minScore);

		averagePlayerScore();
		System.out.println(sum);
		for (int j = 0; j < averages.length; j++)
		{
			System.out.println("" + names[j] + " had an average score of " + averages[j]);
		}
		overAllAvg();
	}

	public void minmaxScoreArray()
	{
		minMaxScores = new int[scores.length][5];
		for (int row = 0; row < scores.length; row++)
		{
			maxScore = scores[row][0];
			minScore = scores[row][0];
			for (int col = 0; col < scores[row].length; col++)
			{
				if (scores[row][col] > maxScore)
					maxScore = scores[row][col];

				if (scores[row][col] < minScore)
					minScore = scores[row][col];
			}
			minMaxScores[row][0] = minScore;
			minMaxScores[row][1] = maxScore;
		}
	}

	public int overAllMax()
	{
		maxScore = minMaxScores[0][1];
		for (int i = 0; i < minMaxScores.length; i++)
		{
			if (minMaxScores[i][1] > maxScore)
			{
				maxScore = minMaxScores[i][1];
				maxScoreBowler = "" + names[i];
			}
		}
		return maxScore;
	}

	public int overAllMin()
	{
		minScore = minMaxScores[0][0];
		for (int i = 0; i < minMaxScores.length; i++)
		{
			if (minMaxScores[i][0] < minScore)
			{
				minScore = minMaxScores[i][0];
				minScoreBowler = "" + names[i];
			}
		}
		return minScore;
	}

	public void averagePlayerScore()
	{
		int rowNum = -1;
		for (int row = 0; row < scores.length; row++)
		{
			sum = 0.0;
			for (int col = 0; col < scores[row].length; col++)
			{
				if(col == scores[row].length - 1)
				{
					sum += scores[row][col];
					double avg = sum / 4;
					rowNum ++;
					//System.out.println(rowNum);
					//System.out.println("" + names[rowNum] + " had an average score of " + avg);
					averages[rowNum] = avg;
					break;
				}
				else
					sum += scores[row][col];
			}
		}
	}
	public void overAllAvg()
	{
		double totalAvgSum = 0;
		for (int a = 0; a < averages.length; a ++)
		{
			totalAvgSum += averages[a];
		}
		double avgs = 0;
		avgs = totalAvgSum / 6;
		System.out.println("The overall average of the team was a score of " + avgs);
	}
}