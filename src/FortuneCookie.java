import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public FortuneCookie(String Message){

	JFrame j=new JFrame();
j.setSize(1920, 1080);
	j.setVisible(true);
JButton jb=new JButton("Click for your fortune!");
j.add(jb);
jb.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
int ran=new Random().nextInt(2);
	if (ran==0) {
	JOptionPane.showMessageDialog(null, "You will be forced into Earl Warren for the next 5 years...");
	}
	if (ran==1) {
		JOptionPane.showMessageDialog(null, "Dead");
		}
}
}
