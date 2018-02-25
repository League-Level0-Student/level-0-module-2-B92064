package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[]args) {
	Random rando = new Random();
	int random = rando.nextInt(10);
	int random2 = rando.nextInt(10);
	int random3 = rando.nextInt(10);
	int random4 = rando.nextInt(10);
	int random5 = rando.nextInt(10);
	
	JOptionPane.showMessageDialog(null, "The winning numbers are..."+ random + random2 +random3+random4+random5);
}
}
