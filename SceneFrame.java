/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class contains the frame and timer which implements an action listener that updates the graphics of the drawing objects. 
	It also creates scene canvas object which contains the different drawing objects created in this folder.
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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class SceneFrame{
		private JFrame frame;
		private SceneCanvas scene;
		private Timer timer;
		
	/* 
		Creates a sceneCanvas and frame which displays the scene Canvas on a GUI.
		Also has a timer which updates the graphics without delay.
	*/	
	public SceneFrame(){
		scene = new SceneCanvas();
		frame = new JFrame();
		// creates timer and action listener
		timer = new Timer(0, new ActionListener() { //creates a class for a timer
            public void actionPerformed(ActionEvent ae) {
                scene.updateGraphics();
			}
		});
		timer.start();
	}
	
	/* 
		Sets up the GUI, sets the title and makes the scene and frame visible
	*/	
	public void setUpGUI(){
		Container contentPane = frame.getContentPane();
		frame.add(scene);
		frame.setTitle("MidtermProject-Warain,John Victor-226808");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
}