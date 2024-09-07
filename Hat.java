/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class creates the hat object which is a complex object made with a rectangle and curved paths
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

public class Hat implements DrawingObject{
	
	private double x;
	private double y;
	
	/* 
		Creates the hat object at position x and y. Note that it has a preset color of white and size
	*/
	public Hat(double x, double y){
	this.x = x;
	this.y = y;
	}
	
	/* 
		Draws the hat which will be drawn in front and on top of the kirby object
	*/
	public void draw(Graphics2D g){
		
		//draws the rectangle of the hat
		Color hatcolor = Color.WHITE;
		Rectangle r = new Rectangle(x+40, y-5, 220, 50, hatcolor);
		r.draw(g);
		
		//draws top half of the hat
		Path2D.Double top = new Path2D.Double();
		top.moveTo(x+40, y-5);
		top.curveTo(x-60, y-105, x+120, y-190, x+165, y-90);
		top.curveTo(x+170, y-120, x+250, y-150, x+260, y-80);
		top.curveTo(x+300, y-70, x+300, y-15, x+260, y-5);
		top.lineTo(x+40, y-5);
		g.setColor(hatcolor);
		g.fill(top);
	}
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
	
}