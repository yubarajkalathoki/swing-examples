package com.yubaraj.swing.input;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaDemo extends JFrame {
	public JTextAreaDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JTextArea textArea = new JTextArea();
		textArea.setRows(5);
		

		// Sets value in text field
		
		textArea.setText("Hello World1");
		
		//textArea.getText();//gets text
		
		//adding text field in frame
		add(textArea);
		pack();

	}

	public static void main(String[] args) {
		new JTextAreaDemo();
	}
}
