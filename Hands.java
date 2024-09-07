/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	Creates the hand object which appear from the bottom of the frame to reach out to the burger object
**/
/*
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.
	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.
	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Hands implements DrawingObject{

	private double x;
	private double y;
	private long start;
	private int counter;
	
	/* 
		Constructs the hand object at position x and y
	*/
	public Hands(double x ,double y){
		start = 0;
		counter = 0;
		this.x = x;
		this.y = y;
	}
		
	/* 
		Draws the a pair of two angled ellipses with a preset size and color
	*/	
	public void draw(Graphics2D g){
		
		AffineTransform reset = g.getTransform();
		
		Color skinCol = Color.decode("#ff7524");
		
		//left hand
		g.rotate(Math.toRadians(30), x, y);
		Ellipse2D.Double hand1 = new Ellipse2D.Double(x, y-50, 150, 400);
		g.setColor(skinCol);
		g.fill(hand1);
		g.setTransform(reset);
		
		
		//right hand
		g.rotate(Math.toRadians(-30), x+300, y);
		Ellipse2D.Double hand2 = new Ellipse2D.Double(x+150, y-50, 150, 400);
		g.setColor(skinCol);
		g.fill(hand2);
		g.setTransform(reset);
	}
	
	/* 
		Animation portion, counter acts as the delay and the if statements adjust the y positions of the hands
	*/
	public void updateG(){
		long end = System.currentTimeMillis(); //mechanism for delays and adding an animation
		if(end - start > 80 ){ //adjusts the speed
			counter++;
			start = end;
			if(counter == 100){
				y = 790;
				counter = 0; //resets the animation
			}
			else if (counter >= 96 && counter < 100)
				y += 50;
			else if(counter >= 92 && counter < 96){
				y += 20;
			}
			else if (counter >= 87 && counter < 92)
				y = y;
			else if (counter >= 84 && counter < 87)
				y -= 7;
			else if (counter >= 80 && counter < 84)
				y -= 35;
			else if (counter >= 80)
				y -= 40;
		}
	}
}