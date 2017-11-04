import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RedGreen implements ActionListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JButton jbred = new JButton("Click me and I'll turn RED!");
	JButton jgreen = new JButton("Click me and I'll turn GREEN!");

	public RedGreen() {
		j.add(jp);
		jp.add(jbred);
		jp.add(jgreen);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setVisible(true);
		jbred.addActionListener(this);
		jgreen.addActionListener(this);
		jbred.setOpaque(true);
		jgreen.setOpaque(true);
		j.pack();
	}

	public static void main(String[] args) {
		new RedGreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbred) {
			jbred.setBackground(Color.green);
			jgreen.setBackground(Color.red);
		} else {
			jgreen.setBackground(Color.green);
			jbred.setBackground(Color.red);
		
		}
	}
}
