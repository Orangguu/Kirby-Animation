/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	Creates a basic square object.
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

public class Square implements DrawingObject{
	
	private double x;
	private double y;
	private Color color;
	private double size;
	
	
	/* 
		Draws the square object that with a specified position, size and color
	*/
	public Square(double x, double y, double size, Color color){
	this.x = x;
	this.y = y;
	this.size = size;
	this.color = color;
	}
	
	/* 
		Draws the square object that with a specified position, size and color
	*/
	public void draw(Graphics2D g){
		Rectangle2D.Double square = new Rectangle2D.Double(x, y, size, size);
		g.setColor(color);
		g.fill(square);
	}
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
}