package com.yubaraj.swing.input;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo extends JFrame {
	public JLabelDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// Creating JLabel object and adding text in center
		JLabel label = new JLabel("Hello", JLabel.CENTER);
//		JLabel label = new JLabel("Hello");
		 add(label);
		//pack();
		 setSize(200,200);

	}

	public static void main(String[] args) {
		new JLabelDemo();
	}
}
