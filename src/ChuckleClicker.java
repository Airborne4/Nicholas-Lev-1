import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton("Joke");
	JButton jb2 = new JButton("Punchline");

	String[] Jokes = { "j1", "j2", "j3" };
	String[] Punch = { "p1", "p2", "p3" };
	int idx = 0;

	public ChuckleClicker() {

		j.add(jp);
		jp.add(jb);
		jp.add(jb2);
		j.setVisible(true);
		j.pack();
		j.setTitle("Chuckle Clicker v1.0");
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jb2.setEnabled(false);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			JOptionPane.showMessageDialog(null, Jokes[idx]);

			jb2.setEnabled(true);
		} else {

			JOptionPane.showMessageDialog(null, Punch[idx]);
			idx++;
			jb2.setEnabled(false);
			if (idx == 3) {
				idx = 0;
			}
		}

	}

}
