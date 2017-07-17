import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JTextField input = new JTextField(20);
	JButton jb = new JButton("Convert");
	JTextField answer = new JTextField(20);

	public binaryConverter() {
		j.add(jp);
		jp.add(input);
		jp.add(jb);
		jp.add(answer);
		j.setVisible(true);
		j.pack();
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		jb.setToolTipText("Click to convert to Binary!");
		input.setToolTipText("Insert pre-translated statement here");
		answer.setToolTipText("Binary translation");
		j.setTitle("Binary Converter");
		jb.addActionListener(this);

	}

	public static void main(String[] args) {
		new binaryConverter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
convert(input);
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\2", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	String convertS(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

}
