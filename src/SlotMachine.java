import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame j = new JFrame();
	JPanel jp1 = new JPanel();
	JButton bspin = new JButton("SPIN!!!");
	JPanel jp2 = new JPanel();
	JLabel jl1 = new JLabel();
	JLabel jl2 = new JLabel();
	JLabel jl3 = new JLabel();

	public SlotMachine() {
		j.add(jp1, BorderLayout.NORTH);
		jp1.add(bspin);
		j.add(jp2, BorderLayout.SOUTH);
		jp2.add(jl1);
		jp2.add(jl2);
		jp2.add(jl3);
		j.setVisible(true);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setSize(600, 200);
		bspin.addActionListener(this);
	}

	public static void main(String[] args) {
		new SlotMachine();
	}

	public void getRandomNum(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bspin) {

		}
	}

}
