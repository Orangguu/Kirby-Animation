/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class contains the Stall object, which is the main foreground of the canvas. It contains the tarpoulines, and wood
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

public class Stall implements DrawingObject{
	
	private Color wood;
	private Color woodshade;
	private Color tarp1;
	private Color tarp2;
	private Color tarpshade1;
	private Color tarpshade2;
	private Color tableCol;
	private Color tableShade;
	
	/* 
		Constructs the Stall object of preset sizes. However, colors may be adjustable by the user.
	*/
	public Stall(Color wood, Color woodshade, Color tarp1, Color tarp2, Color tarpshade1, Color tarpshade2, Color tableCol, Color tableShade){
		
	this.wood = wood;
	this.woodshade = woodshade;
	this.tarp1 = tarp1;
	this.tarp2 = tarp2;
	this.tarpshade1 = tarpshade1;
	this.tarpshade2 = tarpshade2;
	this.tableCol = tableCol;
	this.tableShade = tableShade;
	}
	
	/* 
		Draws the Stall object which consists of many rectangles, circles, and ellipses to create furniture and equipment
		It also uses a for loop for creating circles and squares to create the alternating pattern on the tarpaulin
	*/
	public void draw(Graphics2D g){
		
		//Outer sides 
		Rectangle outr1 = new Rectangle(0, 0, 80, 768, wood);
		Rectangle outr2 = new Rectangle(944, 0, 80, 768, wood);
		outr1.draw(g);
		outr2.draw(g);
		
		//Inner sides
		Rectangle r3 = new Rectangle(80, 0, 60, 768, woodshade);
		Rectangle r4 = new Rectangle(884, 0, 60, 768, woodshade);
		r3.draw(g);
		r4.draw(g);
		
		
		
		//Hanging portion of the top Banner
		for(int i = 0; i<6; i++){
			
			if(i%2==0){
				Square sq = new Square(30+i*160, 0, 160, tarpshade1);
				Circle c = new Circle(30+i*160, 70, 160, tarpshade1);
				c.draw(g);
				sq.draw(g);
			}
			else{
				Square sq = new Square(30+i*160, 0, 160, tarpshade2);
				Circle c = new Circle(30+i*160, 70, 160, tarpshade2);
				c.draw(g);
				sq.draw(g);
			}
		}
		
		//Cover
		Rectangle cover = new Rectangle(0, 0, 1024, 90, wood);
		cover.draw(g);
		
		//Upper portion of the banner
		for(int i = 0; i<6; i++){
			if(i%2==0){
				Path2D.Double p = new Path2D.Double();
				p.moveTo(33+i*160, 90);
				p.lineTo(68+((i+1)*113), 0);
				p.lineTo(68+((i+2)*113), 0);
				p.lineTo(33+((i+1)*160) ,90);
				p.lineTo(33+i*160, 90);
				p.closePath();
				g.setColor(tarp1);
				g.fill(p);
				g.draw(p);
			
			}
			else{
				Path2D.Double p = new Path2D.Double();
				p.moveTo(33+i*160, 90);
				p.lineTo(68+((i+1)*113), 0);
				p.lineTo(68+((i+2)*113), 0);
				p.lineTo(33+((i+1)*160) ,90);
				p.lineTo(33+i*160, 90);
				p.closePath();
				g.setColor(tarp2);
				g.fill(p);
				g.draw(p);
				
			}
		}
		
		//Trapezoid of the table
		Path2D.Double p = new Path2D.Double();
		p.moveTo(85, 640);
		p.lineTo(170, 590);
		p.lineTo(858, 590);
		p.lineTo(940 ,640);
		p.closePath();
		g.setColor(tableCol);
		g.fill(p);
		g.draw(p);
		
		//front of the stall
		Rectangle r2 = new Rectangle(0, 640, 1024, 200, wood);
		Rectangle r5 = new Rectangle(80, 640, 864, 40, tableShade);
		r2.draw(g);
		r5.draw(g);
	
	}
	
	/* 
		Does not do anything, is an implementation of the drawing object interface
	*/
	public void updateG(){
	}
}