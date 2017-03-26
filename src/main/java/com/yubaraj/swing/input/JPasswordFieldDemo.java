package com.yubaraj.swing.input;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordFieldDemo extends JFrame {
	public JPasswordFieldDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JPasswordField passwordField = new JPasswordField();

		/*
		 * Sets value in text field and hides original characters
		 */
		passwordField.setText("pass");

		// adding text field in frame
		add(passwordField);
		pack();
	}

	private void getValuesFromPasswordField(JPasswordField passwordField){
//		String p = passwordField.getText();
		char[] password = passwordField.getPassword();
		String pass = new String(password);
	}
	
	public static void main(String[] args) {
		new JPasswordFieldDemo();
	}

}
