/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	Creates the kirby object while drawing a hat object in front
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

public class Kirby implements DrawingObject{
	
	private double x, y, angle, size;
	private long start;
	private int counter;
	
	/* 
		Constructs a kirby object at position x and y, with a fixed size
	*/
	public Kirby(double x, double y){
		
		start = 0;
		counter = 0;
		this.x = x;
		this.y = y;
		angle = 0;
		size = 270;
	} 
	
	/* 
		Draws kirby and his hat. Has set colors for skin, eye and highlight. Also has rotated ellipses as hands.
	*/
	public void draw(Graphics2D g2d){
		
		AffineTransform reset = g2d.getTransform();
		
		Color skin = Color.decode("#e9c3ca");
		Color eye = Color.decode("#302725");
		Color highlight = Color.decode("#fcf3f3");
		
		
		//kirby head
		
		Circle head = new Circle(x, y, size, skin);
		head.draw(g2d);


		g2d.rotate(Math.toRadians(angle),x+size*.5,y+size*.5);

		//hands //rotational axis is the center of the ellipses
		Ellipse2D.Double lhand = new Ellipse2D.Double(x-45, y+120, 150, 100);
		g2d.setColor(skin);
		g2d.rotate(Math.toRadians(-40), x+35, y+170);
		g2d.fill(lhand);
		g2d.setTransform(reset);
		
		Ellipse2D.Double rhand = new Ellipse2D.Double(x+160, y+120, 150, 100);
		g2d.setColor(skin);
		g2d.rotate(Math.toRadians(40), x+235, y+170);
		g2d.fill(rhand);
		g2d.setTransform(reset);
		
		OpenEye openeye = new OpenEye(x, y);
		ClosedEye closedeye = new ClosedEye(x, y);
		
		//smile
		Path2D.Double mouth = new Path2D.Double();
		mouth.moveTo(x+130, y+150);
		mouth.curveTo(x+135, y+155, x+145, y+155, x+150, y+150);
		g2d.setColor(eye);
		g2d.setStroke(new BasicStroke(6));
		g2d.draw(mouth);
		
		Hat hat = new Hat(x-14, y+11);
		hat.draw(g2d);
		
		g2d.setTransform(reset);
		
		 //creates the blinks animation
		if(counter % 24 == 0)  
			closedeye.draw(g2d);
		else
			openeye.draw(g2d);
	}

	/* 
		Creates the Animation portion, counter acts as the delay and the if statements adjust the x and y positions of kirby as well as his speed
	*/
	public void updateG(){
		long end = System.currentTimeMillis(); //mechanism for delays and adding an animation
		if(end - start > 80 ){ //adjusts the speed
			counter++;
			start = end;
			
			if(counter == 100){
				x = 390;
				y = 380;
				counter = 0;
			}
			else if (counter >= 69 && counter < 80){
				if(counter % 2 == 0)
					y+=5;
				else
					y-=5;
				x -= 25;
			}
			else if (counter >= 60 && counter < 69){
				x -= 36;
			}
			else if (counter >= 50 && counter < 60){
				x = x;
			}
			else if (counter >= 30 && counter < 50){
				if(counter % 2 == 0)
					y+=5;
				else
					y-=5;
				x+=30;
			}
		}
	}
}