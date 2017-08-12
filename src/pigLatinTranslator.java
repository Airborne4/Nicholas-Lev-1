import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatinTranslator implements ActionListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JTextField answer = new JTextField(20);
	JButton jb = new JButton("Translate!");
	JTextField input = new JTextField(20);

	public pigLatinTranslator() {

		j.add(jp);
		jp.add(input);
		jp.add(jb);
		jp.add(answer);
		j.setVisible(true);
		j.pack();
		jb.setToolTipText("Click to translate!");
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		answer.setToolTipText("Your translated word!");
		input.setToolTipText("Insert word here");
	jb.addActionListener(this);
	}

	public static void main(String[] args) {
		new pigLatinTranslator();
	}

	  private static boolean isLetter(char c) {
		    return ( (c >='A' && c <='Z') || (c >='a' && c <='z') );

	  }

	  private static String pigWord(String word) {
		    int split = firstVowel(word);
		    return word.substring(split)+"-"+word.substring(0, split)+"ay";
		  }

	  public String translate(String s) {
		    String latin = "";
		    int i = 0;
		    while (i<s.length()) {

		      // Take care of punctuation and spaces
		      while (i<s.length() && !isLetter(s.charAt(i))) {
		        latin = latin + s.charAt(i);
		        i++;
		      }

		      // If there aren't any words left, stop.
		      if (i>=s.length()) break;

		      // Otherwise we're at the beginning of a word.
		      int begin = i;
		      while (i<s.length() && isLetter(s.charAt(i))) {
		        i++;
		      }

		      // Now we're at the end of a word, so translate it.
		      int end = i;
		      latin = latin + pigWord(s.substring(begin, end));
		    }
		    return latin;
		  }

		  /**
		   * Method to find the index of the first vowel in a word.
		   * @param word The word to search
		   * @return The index of the first vowel
		   */
		  private static int firstVowel(String word) {
		    word = word.toLowerCase();
		    for (int i=0; i<word.length(); i++)
		      if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
		          word.charAt(i)=='i' || word.charAt(i)=='o' ||
		          word.charAt(i)=='u')
		        return i;
		    return 0;
		  }

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==jb) {
				answer.setText(translate(input.getText()));
			}
			
		}



}
	  
	  








