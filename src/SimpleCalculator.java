import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {

	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JTextField jt1 = new JTextField(10);
	JTextField jt2 = new JTextField(10);
	JButton jb1 = new JButton("+");
	JButton jb2 = new JButton("-");
	JButton jb3 = new JButton("*");
	JButton jb4 = new JButton("÷");
	JLabel janswer = new JLabel();

	public SimpleCalculator() {

	
		jp.add(jt1);
		jp.add(jt2);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		jp3.add(janswer);
		j.add(jp);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		j.pack();

		j.setVisible(true);

	}

	public static void main(String[] args) {
		new SimpleCalculator();
	}

public int add(int x,int y){
	return(x+y);
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}

	
	
	
}
