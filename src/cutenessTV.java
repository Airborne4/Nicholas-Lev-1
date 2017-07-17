import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
	JFrame j=new JFrame();
	JPanel jp=new JPanel();
	JButton jb1=new JButton("Video 1");
	JButton jb2=new JButton("Video 2");
	JButton jb3=new JButton("Video 3");
	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public cutenessTV(){
	
	j.setVisible(true);
	j.add(jp);
	jp.add(jb1);
	jp.add(jb2);
	jp.add(jb3);
	jb1.setToolTipText("Click to play Video #1!");
	jb2.setToolTipText("Click to play Video #2!");
	jb3.setToolTipText("Click to play Video #3!");
	jp.setLayout(new GridLayout(1, 3));
	j.pack();
	j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
	
}
public static void main(String[] args) {
	new cutenessTV();
}
@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == jb1) {
	playVideo("Drirjl5K9Yk");
}
if (e.getSource() == jb2) {
	playVideo("aSjCb-FfxhI");
}	
if (e.getSource() == jb3) {
	playVideo("qRC4Vk6kisY");
}
}

}
