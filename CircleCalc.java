package javaconcepts;

import graphicalapps.MasterJFrame_JacobBullin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class CircleCalc extends JComponent
{
	public CircleCalc()
	{

	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle backGround = new Rectangle(0,0,500,500);
		g2.setColor(Color.BLACK);
		g2.fill(backGround);
		Ellipse2D.Double a = new Ellipse2D.Double(50, 50, 100, 100);
		g2.setColor(Color.WHITE);
		g2.fill(a);
		g2.setColor(Color.DARK_GRAY);
		g2.draw(a);
	}
}
