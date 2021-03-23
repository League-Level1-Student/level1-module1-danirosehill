package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor=JOptionPane.showInputDialog("What flavor of popcorn would you like?");
		String time= JOptionPane.showInputDialog("How much time should I put it in for?");
		Popcorn pop = new Popcorn(flavor);
		Microwave mic = new Microwave();
		mic.putInMicrowave(pop);
		int x= Integer.parseInt(time);
		mic.setTime(x);
		
		
	
		}
	}
