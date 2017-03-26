package com.yubaraj.swing.action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonActionDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Event Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Login");
		button.addActionListener(new ButtonListener());

		// button.addActionListener(new ActionListener(){
		// public void actionPerformed(ActionEvent ae){
		// JOptionPane.showMessageDialog(null, "Hello World!");
		// }
		// });
		
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
	}

}

class ButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent ae) {
		JOptionPane.showMessageDialog(null, "Hello World!");
	}
}