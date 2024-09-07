/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class contains the OpenEye object which will be drawn on the Kirby object during the animation
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

public class OpenEye implements DrawingObject{
	
	private double x, y;
	
	/* 
		Constructs an open eye at position x and y
	*/
	public OpenEye(double x, double y){
		
		this.x = x;
		this.y = y;
	} 
	
	/* 
		Draws the elements of the open eye, featuring 2 eyes with white highlights
	*/
	public void draw(Graphics2D g2d){
		
		Color eye = Color.decode("#302725");
		Color highlight = Color.decode("#fcf3f3");
		
		Ellipse2D.Double eye1 = new Ellipse2D.Double(x+95, y+90, 30, 60);
		g2d.setColor(eye);
		g2d.fill(eye1);
		
		Ellipse2D.Double eye2 = new Ellipse2D.Double(x+155, y+90, 30, 60);
		g2d.setColor(eye);
		g2d.fill(eye2);
	  
		Ellipse2D.Double hglt1 = new Ellipse2D.Double(x+105, y+90, 20, 25);
		g2d.setColor(highlight);
		g2d.fill(hglt1);
	  
		Ellipse2D.Double hglt2 = new Ellipse2D.Double(x+165, y+90, 20, 25);
		g2d.setColor(highlight);
		g2d.fill(hglt2);

	}
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/

	public void updateG(){
	}
}