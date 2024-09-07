/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class contains the canvas of which the drawing objects will be painted on. It paints the objects on the canvas and repaints the canvas
	if ever there is an update to the graphics.
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
import java.util.*;

public class SceneCanvas extends JComponent {
	
	private ArrayList<DrawingObject> objects;
	private int counter;
	
	/* 
		Adds all objects into an arraylist so that it may be painted on the canvas later on
	*/
	public SceneCanvas() {

		objects = new ArrayList<DrawingObject>();
		
		setPreferredSize(new Dimension(1024, 768));
		
		objects.add(new StallBackG(Color.decode("#5d2957"), Color.decode("#2c0822"), Color.decode("#b4568f"),
		Color.decode("#a5468b"), Color.decode("#982d82"), Color.decode("#ff66cc")));
		objects.add(new Kirby(390, 380));
		objects.add(new Stall(Color.decode("#f49cbf"), Color.decode("#bb799a"), Color.decode("#e81435"), Color.decode("#ff66cc"),
		Color.decode("#b41864"), Color.decode("#bb63b0"), Color.decode("#d11255"), Color.decode("#9e1646"))); 		
		objects.add(new Hands(180, 780));
		objects.add(new Burger(1024, 550));
		objects.add(new Board(780, 460));
		
	}
	
	/* 
		Turns antialiasing on and paints the objects onto the canvas
	*/	
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		for (DrawingObject object : objects)
			object.draw(g2d);
			
	}
	
	/* 
		Updates the graphics of the objects, then repaints the canvas
	*/	
	public void updateGraphics(){
		for (DrawingObject object : objects){
			object.updateG();
		}
		this.repaint();
	}
	
}