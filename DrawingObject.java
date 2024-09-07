/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This interface implements two methods, draw and UpdateG
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
import javax.swing.*;

public interface DrawingObject{
	/* 
		implements the draw method on all drawing objects
	*/	
	void draw(Graphics2D g2d);
	
	/* 
		Updates the object so that it may be updated on the canvas
	*/	
	public void updateG();
}