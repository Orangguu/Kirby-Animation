/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class creates a simple triangle object
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

public class Triangle implements DrawingObject{
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private Color color;


	/* 
		Creates the triangle object which takes 3 sets of x and y coordinates to construct the shape. Color may be adjusted by the user.
	*/
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.color = color;
	}
	
	/* 
		Draws the triangle object which takes 3 sets of x and y coordinates to construct the shape. It then fills the shape with the specified color earlier.
	*/
	public void draw(Graphics2D g2d){
		Path2D.Double triangle = new Path2D.Double();
		triangle.moveTo(x1, y1);
		triangle.lineTo(x2, y2);
		triangle.lineTo(x3, y3);
		triangle.closePath();
		g2d.setColor(color);
		g2d.fill(triangle);
	}
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
}