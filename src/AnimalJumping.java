import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalJumping {

	static JFrame j = new JFrame();
	static String pic = "http://i.imgur.com/Jdt1rRf.gif";

	public static void main(String[] args) throws MalformedURLException {

		j.setVisible(true);
	j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		try {
			j.add(createImage(pic));
		} catch (MalformedURLException e) {
			System.out.println("Oops! That's an invalid file!");

			j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
			

		}
j.pack();

	
	}

	static JLabel createImage(String imageURL) throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}
}
