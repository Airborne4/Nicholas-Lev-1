import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame j = new JFrame();
	JPanel jp1 = new JPanel();
	JButton bspin = new JButton("SPIN!!!");
	JPanel jp2 = new JPanel();
	JLabel jl1 = new JLabel();
	JLabel jl2 = new JLabel();
	JLabel jl3 = new JLabel();
	Random r1 = new Random();
	int counter;
	String orange = "orange.png";
	String cherry = "cherry.png";
	String banana = "banana.png";
	Song win = new Song("slm.mp3");

	public SlotMachine() {
		j.add(jp1, BorderLayout.NORTH);
		jp1.add(bspin);
		j.add(jp2, BorderLayout.SOUTH);
		j.setVisible(true);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setSize(615, 260);
		bspin.addActionListener(this);

	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) {
		new SlotMachine();
	}

	public int getRandomNum() {

		return r1.nextInt(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bspin) {
			int getr1 = getRandomNum();
			int getr2 = getRandomNum();
			int getr3 = getRandomNum();
			jp2.removeAll();
			if (getr1 == 0) {
				jl1 = loadImage(orange);
			}
			if (getr1 == 1) {
				jl1 = loadImage(cherry);
			}
			if (getr1 == 2) {
				jl1 = loadImage(banana);
			}

			if (getr2 == 0) {
				jl2 = loadImage(orange);
			}
			if (getr2 == 1) {
				jl2 = loadImage(cherry);
			}
			if (getr2 == 2) {
				jl2 = loadImage(banana);
			}

			if (getr3 == 0) {
				jl3 = loadImage(orange);
			}
			if (getr3 == 1) {
				jl3 = loadImage(cherry);
			}
			if (getr3 == 2) {
				jl3 = loadImage(banana);
			}
			jp2.add(jl1);
			jp2.add(jl2);
			jp2.add(jl3);
			jp2.repaint();
			j.pack();

			counter++;
			System.out.println(counter);

			if (jl1.getIcon().toString().equals(jl2.getIcon().toString())
					&& jl3.getIcon().toString().equals(jl2.getIcon().toString())) {
				win.play();
				JOptionPane.showMessageDialog(null, "You Won! it took you " + counter + " attempts");
				counter = 0;
			}

		}
	}

}
