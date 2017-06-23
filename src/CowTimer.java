import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;
 
public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 * Work in seconds when testing, then change to minutes
	 */
 
	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
 CowTimer ct=new CowTimer();
 ct.setTime(550);
 ct.start();
	}
 
	private int seconds;
 
	public void setTime(int minutes) {
		this.seconds = minutes;
		System.out.println("Cow set to " + minutes + " seconds.");
	}
 
	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 
		 * seconds using Thread.sleep(int milliseconds).
		 */
 for (int i = seconds; i > 0; i--) {
Thread.sleep(1000);
	 System.out.println(i);	
}
		
speak("Moo ma dude, do you want some food? Hey whats good, do you want some wood. Ya... Its MC Moo man on da mic. Comen atchu like a cow, u aint gonna know how! Ya... lets take it on back ma moo dudes. Moo, moo, its what i like to do. People try to eat me but Im gonna beat thee.");
 
 /*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to walk.
		 */

 


	}
 
	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
 
private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
 
}
