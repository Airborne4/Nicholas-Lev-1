import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypeOrDie implements KeyListener {

	JFrame j = new JFrame("Type Or DIE!");
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	char currentLetter = generateRandomLetter();
	int keyCounter = 0;

	public TypeOrDie() {
		j.setVisible(true);
		j.add(jp);
		jp.add(jl);

		jl.setText(String.valueOf(currentLetter));
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);

		jl.setFont(jl.getFont().deriveFont(50.0f));
		jl.setHorizontalAlignment(jl.CENTER);

		j.addKeyListener(this);
		jl.setOpaque(true);

		j.pack();

	}

	public static void main(String[] args) {
		new TypeOrDie();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		keyCounter++;
	if (keyCounter==20) {
		showTypingSpeed(keyCounter);
	keyCounter=0;
	}
	
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());
		if (currentLetter == e.getKeyChar()) {
			jl.setOpaque(true);
			jl.setBackground(Color.GREEN);

		} else {
			jl.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		jl.setText(String.valueOf(currentLetter));

	}

	
	
	
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

	Date timeAtStart = new Date();

}
