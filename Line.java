/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class creates a simple line object
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

public class Line implements DrawingObject{
	
	private double x;
	private double y;
	private double x1;
	private double y1;
	private Color color;
	private float size;
	
	/* 
		Constructs the line object that with a specified position, size and color
	*/
	public Line(double x, double y, double x1, double y1, float size, Color color){
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;
		this.size = size;
		this.color = color;
	}
	
	/* 
		Draws the line object that with a specified position, size and color
	*/
	public void draw(Graphics2D g){
		Line2D.Double line = new Line2D.Double(x, y, x1, y1);
		g.setColor(color);
		g.setStroke(new BasicStroke(size));
		g.draw(line);
	}
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
}