package com.yubaraj.swing.menu;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Test extends JFrame {

	public Test() {
		setTitle("Menu Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);

		// creating menu bar
		JMenuBar menuBar = new JMenuBar();
		menuBar.add
		menuBar.add(Box.createRigidArea(new Dimension(100,25)));
		
		
		// adding menu bar in frame
		add(menuBar);

	}

	public static void main(String[] args) {
		new Test();
	}
}
