/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class creates and draws a simple circle object
	
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

public class Circle implements DrawingObject{
	
	private double x;
	private double y;
	private Color color;
	private double size;
	
	/* 
		Creates the circle object that with a specified position, size and color
	*/
	public Circle(double x, double y, double size, Color color){
	this.x = x;
	this.y = y;
	this.size = size;
	this.color = color;
	}
	
	/* 
		Draws the circle using an ellipse2d object.
	*/
	public void draw(Graphics2D g){
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
		g.setColor(color);
		g.fill(circle);
	}
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
}