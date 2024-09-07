/**
	@author John Victor R. Warain (226808)
	@version March 7, 2023
	
	This class runs the program, creating a scene frame and starts playing music
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

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

//Audio and music retrived from //https://www.youtube.com/watch?v=G7h3IeZ29A0&ab_channel=Vivi%27sRadioBackupChannel~RareVGM

public class SceneStarter{

	/* 
		Creates a scene frame, sets up the GUI, and plays the music
	*/	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		SceneFrame sf = new SceneFrame();
		
		//file directory
		File filePath = new File("Melody Town - Kirby.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(filePath);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		
		//sets up the scene frame
		sf.setUpGUI();
	}

}