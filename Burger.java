/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class contains the Burger object which is a complex shape consisting of a bun, patty, cheese, and lower bun.
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


public class Burger implements DrawingObject{
	
	private double x;
	private double y;
	private int counter;
	private long start;
	
	/* 
		Constructs the burger object at position x and y with a preset size and color
	*/	
	
	public Burger(double x, double y){
	this.x = x;
	this.y = y;
	counter = 0;
	start = 0;
	}
	
	/* 
		Draws the burger that consists of multiple shapes. These shapes include the plate, patty, cheese, and buns.
	*/
	public void draw(Graphics2D g){
		
		Color bunCol = Color.decode("#e6aa89");
		Color plateCol = Color.decode("#fff1f3");
		Color pattyCol = Color.decode("#9c3952");
		Color cheeseCol = Color.decode("#dbd97a");
		
		
		//plate
		Ellipse2D.Double plate = new Ellipse2D.Double(x-10, y+40, 180, 50);
		g.setColor(plateCol);
		g.fill(plate);
		
		//patty
		Rectangle patty = new Rectangle(x+10, y+10, 140, 40, pattyCol);
		Circle lpatty = new Circle(x-10, y+10, 40, pattyCol);
		Circle rpatty = new Circle(x+130, y+10, 40, pattyCol);
		patty.draw(g);
		lpatty.draw(g);
		rpatty.draw(g);
		
		//cheese
		Triangle cheese = new Triangle(x+10,y+10, x+150, y, x+130, y+40,cheeseCol);
		cheese.draw(g);
		
		//bottombun
		Rectangle  bbun = new Rectangle(x, y+50, 160, 20, bunCol);
		bbun.draw(g);
		
		//top bun
		Path2D.Double tbun = new Path2D.Double();
		tbun.moveTo(x, y);
		tbun.curveTo(x+10, y-80, x+150, y-80, x+160, y);
		tbun.curveTo(x+150, y+20, x, y+20, x, y);
		g.setColor(bunCol);
		g.fill(tbun);
	}
	
	/* 
		Animation portion, counter acts as the delay and the if statements adjust the x and y positions of the burger
	*/
	public void updateG(){ //animation
		long end = System.currentTimeMillis(); //mechanism for
		
		if(end - start > 80 ){
			counter++;
			start = end;
			if(counter == 100){
				y = 550;
				x = 1030;
				counter = 0;
			}
			else if(counter >= 96 && counter < 100){
				y += 50;
			}
			else if(counter >= 92 && counter < 96){
				y += 20;
			}
			else if(counter >= 82 && counter < 90){
				x = x;
			}
			else if(counter >= 80 && counter < 82){
				x += 4;
			}
			else if(counter >= 74 && counter < 78){
				x -= 25;
			}
			else if(counter >= 70 && counter < 74){
				x -= 45;
			}
			else if(counter >= 60 && counter < 70){
				x -= 50;
			}
		}
	}
}