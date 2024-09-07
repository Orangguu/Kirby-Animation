/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	Creates a basic rectangle object
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
import java.awt.geom.*;

public class Rectangle implements DrawingObject{
	
	/* 
		Draws the rectangle object that with a specified position, width, height, and color
	*/
	private double x;
	private double y;
	private Color color;
	private double w;
	private double h;
	
	/* 
		Provides adjustable paramters for the rectangle for specific positions, width, height, and color
	*/
	public Rectangle(double x, double y, double w, double h, Color color){
	this.x = x;
	this.y = y;
	this.w = w;
	this.h = h;
	this.color = color;
	}
	
	/* 
		Draws the rectangle object with a specified position, size and color
	*/
	public void draw(Graphics2D g){
		Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, w, h);
		g.setColor(color);
		g.fill(rectangle);
	}
	
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
}