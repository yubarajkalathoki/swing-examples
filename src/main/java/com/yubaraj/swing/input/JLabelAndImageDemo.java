package com.yubaraj.swing.input;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.yubaraj.swing.listener.ButtonListener;

public class JLabelAndImageDemo extends JFrame {
	public JLabelAndImageDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// Creating JLabel object and adding text in center
		addImage();
		pack();
	}

	private void addImage() {
		ImageIcon icon = new ImageIcon("C:\\Users\\Yuba Raj Kalathoki\\Pictures\\JamesGosling.jpg", "James Gosling");

		// Create the first label.
		JLabel label = new JLabel("Image and Text", icon, JLabel.CENTER);
		label.setToolTipText("Tooltip test");
		
		ButtonListener listener = new ButtonListener();
		label.addMouseListener(listener);
		
		add(label);
	}

	public static void main(String[] args) {
		new JLabelAndImageDemo();
	}
}