import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
JFrame j=new JFrame();
		JPanel jp=new JPanel();
		JButton jb=new JButton("Joke");
		JButton jb2=new JButton("Punchline");
	public ChuckleClicker(){
		
		j.add(jp);
		jp.add(jb);
		jp.add(jb2);
		j.setVisible(true);
		j.pack();
	j.setTitle("Chuckle Clicker v1.0");
	jb.addActionListener(this);
    jb2.addActionListener(this);
	
	}
	
	
	
	public static void main(String[] args) {
	ChuckleClicker cc=new ChuckleClicker();
}



	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Hola");
	if (e.getSource()==jb) {
	JOptionPane.showMessageDialog(null,"<Insert Joke Here>" );	
	} 	
	else {
		JOptionPane.showMessageDialog(null, "<Insert Punchline Here>");
	}
	}
}
