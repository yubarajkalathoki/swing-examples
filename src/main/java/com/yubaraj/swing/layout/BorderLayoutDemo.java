package com.yubaraj.swing.layout;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

/**
 * 
 * @author Yubaraj
 */
public class BorderLayoutDemo {
	public BorderLayoutDemo() {
		JFrame frame = new JFrame("BorderLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setLayout(new BorderLayout());
		frame.add(new Button("North"), BorderLayout.NORTH);
		frame.add(new Button("South"), BorderLayout.SOUTH);
		frame.add(new Button("East"), BorderLayout.EAST);
		frame.add(new Button("West"), BorderLayout.WEST);
		frame.add(new Button("Center"), BorderLayout.CENTER);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
}
