/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class contains the ClosedEye object which will be drawn on the Kirby object during the animation
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

public class ClosedEye implements DrawingObject{
	
	private double x, y;
	
	/* 
		Constructs an closed eye at position x and y
	*/
	public ClosedEye(double x, double y){
		
		this.x = x;
		this.y = y;
	} 
	
	/* 
		Draws the closed eye creating two line objects for each eye
	*/
	public void draw(Graphics2D g2d){
		
		Color eyeCol = Color.BLACK;
		
		//Left Eye
		Line lefteye1 = new Line(x+90, y+145, x+120, y+140, 6,  eyeCol);
		Line lefteye2 = new Line(x+90, y+135, x+120, y+140, 6, eyeCol);
		lefteye1.draw(g2d);
		lefteye2.draw(g2d);
		
		//Right Eye
		Line righteye1 = new Line(x+190, y+145, x+160, y+140, 6, eyeCol);
		Line righteye2 = new Line(x+190, y+135, x+160, y+140, 6, eyeCol);
		righteye1.draw(g2d);
		righteye2.draw(g2d);
	}


	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
}