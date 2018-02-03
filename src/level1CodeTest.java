import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class level1CodeTest implements ActionListener {

	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();

	public level1CodeTest() {
		j.add(jp);
		jp.add(jb);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.pack();
		j.setVisible(true);
		jb.setBackground(Color.YELLOW);
		jb.setOpaque(true);
		jb2.setBackground(Color.RED);
		jb2.setOpaque(true);
		jb3.setBackground(Color.BLUE);
		jb3.setOpaque(true);
		jb4.setBackground(Color.GREEN);
		jb4.setOpaque(true);

		jb.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);

	}

	public static void main(String[] args) {
		new level1CodeTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			speak("Yellow");
		} else if (e.getSource() == jb2) {
			speak("Red");
		} else if (e.getSource() == jb3) {
			speak("Blue");
		} else if (e.getSource() == jb4) {
			speak("Green");
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
