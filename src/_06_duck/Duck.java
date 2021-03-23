package _06_duck;

import javax.swing.JOptionPane;

public class Duck {
	
int numberOfFriends;
String favoriteFood;

void quack () {
	JOptionPane.showMessageDialog(null, "QUACK!");
}

void waddle () {
	JOptionPane.showMessageDialog(null, "Your duck is waddling.");
	
}

	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	
}
