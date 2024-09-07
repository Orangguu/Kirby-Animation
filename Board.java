/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class contains the Board object which will contain a tally counter of the total number of burgers sold
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

public class Board implements DrawingObject{

	private double x;
	private double y;
	private int counter;
	private long start;
	
	/* 
		Draws the board at the lower right corner with set sizes and colors
	*/
	public Board(double x ,double y){
		
		this.x = x;
		this.y = y;
		counter = -1;
		start = 0;
	}
		
	public void draw(Graphics2D g){
	
		AffineTransform reset = g.getTransform();
		
		g.rotate(Math.toRadians(6), x, y);
		
		Color boardCol1 = Color.decode("#9e2651");
		Color boardCol2 = Color.WHITE;
		Color countCol = Color.decode("#e81435");
		
		Rectangle tip1 = new Rectangle(x+80, y-60, 60, 80, boardCol1);
		Rectangle tip2 = new Rectangle(x+190, y-60, 60, 80, boardCol1);
		Rectangle board1 = new Rectangle(x, y, 400, 768, boardCol1);
		Rectangle board2 = new Rectangle(x+30, y+30, 400, 768, boardCol2);
		tip1.draw(g);
		tip2.draw(g);
		board1.draw(g);
		board2.draw(g);
		
		//Creats the tally counter inside the board
		Font font = new Font("Comic Sans MS", Font.BOLD, 200);
		String count = Integer.toString(counter);
		g.setFont(font);
		g.setColor(countCol);
		if(counter < 10)
			g.drawString(count, 890, 710);
		else
			g.drawString(count, 840, 710); //Adjusts once double digits appear
		
		g.setTransform(reset);
	}
	
	/* 
		Animation portion, updates the text on the board after a set time which is an estimate of when a burger is sold
	*/
	public void updateG(){
		long end = System.currentTimeMillis();
		
		if(end - start > 9000){ //estimates the time a burger is sold
			counter++;
			start = end;
		}
	}
		
}