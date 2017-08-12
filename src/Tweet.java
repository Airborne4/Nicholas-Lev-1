import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Tweet implements ActionListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JTextField input = new JTextField(20);
	JButton jb = new JButton("Search the TWITTERVERSE!");
	JTextField newtweet = new JTextField(20);

	public Tweet() {

		j.add(jp);
		jp.add(input);
		jp.add(jb);
		jp.add(newtweet);
		j.pack();
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb.addActionListener(this);
		

	}

	public static void main(String[] args) {
		new Tweet();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("tweet tweet");
		String ltweet = getLatestTweet(input.getText());
		newtweet.setText(ltweet);
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

}
