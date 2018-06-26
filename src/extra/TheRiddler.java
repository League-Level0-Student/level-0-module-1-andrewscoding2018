package extra;

import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score = 0;
	String riddlea = JOptionPane.showInputDialog("What is Beethoven doing now?");
	if(riddlea.equals("De-composing")) {
	score= score++;
	}
	else {
		JOptionPane.showMessageDialog(null, "Loser. The answer mas de-composing. Muahaha.");
	}
	String riddleb = JOptionPane.showInputDialog("Why did the pianist keep banging his head against the keys?");
	if(riddleb.equals("He was playing by ear.")) {
	score= score++;
	}
	else {
		JOptionPane.showMessageDialog(null, "Loser. The answer was he was playing by ear. Muahaha.");
	}
	String riddlec = JOptionPane.showInputDialog("What’s a golf clubs favorite type of music?");
	if(riddlec.equals("Swing.")) {
	score= score++;
	}
	else {
		JOptionPane.showMessageDialog(null, "Loser. The answer was swing. Muahaha.");
	}
	String riddled = JOptionPane.showInputDialog("How do crazy people go through the forest?");
	if(riddled.equals("They take the psycho path.")) {
	score= score++;
	}
	else {
		JOptionPane.showMessageDialog(null, "Loser. The answer was that they take the psycho path. Muahaha.");
	}
	
	JOptionPane.showMessageDialog(null, "Your score this time was " + score + " .");
	
}
}
