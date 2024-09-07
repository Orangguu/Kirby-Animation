/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class creates the StallBackG which stands for the stall background.
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
import java.util.*;

//Will be placed behind the stall, becoming the true background object

public class StallBackG implements DrawingObject{
	
	
	private Color back1; 
	private Color back2; 
	private Color tableCol1;
	private Color tableCol2;
	private Color tableCol3;
	private Color extra;
	
	/* 
		Creates the stallbackg object with adjustable colors that can be modified by the user
	*/
	public StallBackG(Color back1, Color back2, Color tableCol1, Color tableCol2, Color tableCol3, Color extra){
		
	this.back1 = back1;
	this.back2 = back2;
	this.tableCol1 = tableCol1;
	this.tableCol2 = tableCol2;
	this.tableCol3 = tableCol3;
	this.extra = extra;
	
	}
	
	/* 
		Draws the StallBackG object which consists of many rectangles, circles, and ellipses to create furniture and equipment
	*/
	public void draw(Graphics2D g){
		
		//Background
		Rectangle background = new Rectangle(0, 100, 1024, 768, back1);
		Rectangle background2 = new Rectangle(690, 124, 300, 768, back2);
		background.draw(g);
		background2.draw(g);
		
		//table
		Rectangle outr1 = new Rectangle(0, 420, 1024, 60, tableCol1);
		Rectangle outr2 = new Rectangle(0, 470, 1024, 20, tableCol2);
		Rectangle outr3 = new Rectangle(0, 470, 1024, 368, tableCol3);
		outr1.draw(g);
		outr3.draw(g);
		outr2.draw(g);
		
		//Refrigerator
		Ellipse2D.Double topFridge = new Ellipse2D.Double(30, 250, 200, 40);
		g.setColor(extra);
		g.fill(topFridge);
		Rectangle fridge = new Rectangle(30, 270, 200, 250, extra);
		fridge.draw(g);
		
		//Pans
		Rectangle handle1 = new Rectangle(295, 200, 15, 50, tableCol1);
		Rectangle handle2 = new Rectangle(388, 150, 15, 100, tableCol1);
		Circle pot = new Circle(260, 240, 90, tableCol1);
		Circle pot2 = new Circle(360, 230, 70, tableCol1);
		handle1.draw(g);
		handle2.draw(g);
		pot.draw(g);
		pot2.draw(g);
		
		//Spices
		Rectangle box1 = new Rectangle(740, 360, 50, 90, extra);
		Circle cap1 = new Circle(740, 335, 50, extra);
		box1.draw(g);
		cap1.draw(g);
		Rectangle box2 = new Rectangle(810, 400, 50, 50, extra);
		Circle cap2 = new Circle(810, 375, 50, extra);
		box2.draw(g);
		cap2.draw(g);
	}
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
}
		
		
		