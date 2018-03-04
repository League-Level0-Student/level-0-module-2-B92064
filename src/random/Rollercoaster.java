package random;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[]args) {
	String height = JOptionPane.showInputDialog("What's your height?(inches)");
	int intheight = Integer.parseInt(height);
	if (intheight <= 48) {
		JOptionPane.showMessageDialog(null, "You need to grow more first!");
	}
	else if(intheight > 48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster!");
	}
	
}
}
