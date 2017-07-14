import java.applet.AudioClip;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class lotteryNumbers implements ActionListener {
	Random r = new Random();
	JLabel jl = new JLabel("Your Lottery #");

	public lotteryNumbers() {

		JFrame j = new JFrame();
		JPanel jp = new JPanel();
		JButton jb = new JButton("Get a Lottery Number!");
		jb.setToolTipText("Click to receive a lottery number!");
		jb.setBackground(Color.CYAN);
jb.setOpaque(true);	
		
j.setVisible(true);
		j.add(jp);
		jp.add(jb);

		jp.add(jl);
		jl.setHorizontalAlignment(JLabel.CENTER);
		jp.setLayout(new GridLayout(1, 2));
		jb.addActionListener(this);
		j.setSize(1920, 1080);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		 new lotteryNumbers();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int n = r.nextInt(1000000);
		playSound("yeet.mp3");
		
		jl.setText("Your lottery number is: " + n);
	}
	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}
}
