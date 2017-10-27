import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable, ActionListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton("Click to play - 'Black Mesa Theme'");
	JButton jb2 = new JButton("Click to play - 'Fun Song'");
	JButton jbs = new JButton("Click to Stop - 'Black Mesa Theme'");
	JButton jbs2 = new JButton("Click to Stop - 'Fun Song'");
JPanel jp2=new JPanel();
	Song s1 = new Song("blackmesa.mp3");

	Song s2 = new Song("bones.mp3");
JButton skip1=new JButton(">>>");
JButton skip2=new JButton(">>>");
	static String currentSong = new String();

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
	}

	public void run() {

		// 3. Find an mp3 on your computer or on the Internet.

		// 4. Create a Song

		j.setVisible(true);
		j.add(jp);
		jp.add(jb);
		jp.add(jbs);

		jp.add(jb2);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);

		jb.add(loadImage("blackmesapic.jpg"));

		jp.add(jbs2);
		jb2.add(loadImage("zoidberg.jpg"));
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jbs.addActionListener(this);
		jbs2.addActionListener(this);
		
		
		j.pack();

		if (currentSong.equals(s1)) {
			s2.stop();
		}
		if (currentSong.equals(s2)) {
			s1.stop();
		}

		/*
		 * 
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
	}

	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			s1.play();
			s1.equals(currentSong);
			s2.stop();
		}
		if (e.getSource() == jb2) {
			s2.play();
			s2.equals(currentSong);
			s1.stop();

		}

		if (e.getSource() == jbs) {
			s1.stop();
		}

		if (e.getSource() == jbs2) {
			s2.stop();
		}

	}

}


