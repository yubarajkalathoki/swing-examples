package com.yubaraj.swing.input;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScrollPaneDemo extends JFrame {
	public JScrollPaneDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JTextArea textArea = new JTextArea();
		textArea.setRows(5);

		/*
		 * creating object.
		 */
		JScrollPane scrollPane = new JScrollPane(textArea);

		// Sets value in text field

		textArea.setText("Hello World1");

		textArea.getText();// gets text

		// adding text field in frame
		add(scrollPane);
		pack();

	}

	public static void main(String[] args) {
		new JScrollPaneDemo();
	}
}
