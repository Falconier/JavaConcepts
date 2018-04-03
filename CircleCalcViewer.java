package javaconcepts;

import java.awt.Color;

import javax.swing.JFrame;

import graphicalapps.MasterJFrame_JacobBullin;

public class CircleCalcViewer
{

	public static void main(String[] args)
	{
		MasterJFrame_JacobBullin frame = new MasterJFrame_JacobBullin(500, 500, "Circle Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CircleCalc alpha = new CircleCalc();
		frame.add(alpha);
		frame.setVisible(true);
	}

}
