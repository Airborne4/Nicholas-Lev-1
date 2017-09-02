import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAButton implements ActionListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	Random r = new Random();
	int rand = r.nextInt(24);
	static int m = 0;
	static Date start = new Date();

	public WhackAButton() {

		for (int i = 0; i < 24; i++) {
			JButton jb = new JButton();
			jp.add(jb);
			if (i == rand) {
				jb.setText("Mole!");

			}

			jb.addActionListener(this);

		}

		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setVisible(true);
		j.add(jp);
		j.setSize(300, 295);
		j.setResizable(false);
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new WhackAButton();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();

		if (jb.getText().equals("Mole!")) {
			m += 1;
			System.out.println(m);
			if (m==10) {
				endGame(start, 10);
				m=0;
			}

			j.dispose();
			new WhackAButton();

		}
		else {
			speak("You are a DORK!");
		}
	
	}
}
