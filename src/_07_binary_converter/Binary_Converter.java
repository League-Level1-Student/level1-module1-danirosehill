package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements ActionListener {
	JTextField text = new JTextField(20);		
	public static void main(String[] args) {
	Binary_Converter convert = new Binary_Converter();
	}
	
	Binary_Converter(){
	JFrame frame = new JFrame ("Binary Converter");
	frame.setVisible(true);
	JPanel panel = new JPanel ();
	frame.add(panel);
	JButton button = new JButton("Convert");
	panel.add(button);
	button.addActionListener(this);
	panel.add(text);
	frame.pack();
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	String s= text.getText();
	String t = convert(s);
	JOptionPane.showMessageDialog(null, t);
	}

}
