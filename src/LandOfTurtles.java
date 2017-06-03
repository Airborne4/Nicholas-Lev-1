import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;
 
public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
 
// 1. Create a frame & make it visible
 JFrame f=new JFrame ();
	
 // 2. Add the panel to the frame
		f.setVisible(true);

		f.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle 
 

f.pack();	
for (int i = 0; i < 50; i++) {
 Turtle t=new Turtle();
 panel.addTurtle(t);	
 t.setX(new Random().nextInt(panel.getWidth()));
 t.setY(new Random().nextInt(panel.getWidth()));
}		

		// 6. Put 50 Turtles on the beach
 
		
		
		
		
		
		
	}
}
 
