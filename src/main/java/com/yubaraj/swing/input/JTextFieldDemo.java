package com.yubaraj.swing.input;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame {
	public JTextFieldDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JTextField nameTextField = new JTextField();

		// Sets value in text field
		
		nameTextField.setText("Hello World1");
		
		//adding text field in frame
		add(nameTextField);
		pack();

	}

	public static void main(String[] args) {
		new JTextFieldDemo();
	}
}
