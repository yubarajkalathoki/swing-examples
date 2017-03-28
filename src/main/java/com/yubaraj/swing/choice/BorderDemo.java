package com.yubaraj.swing.choice;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderDemo extends JFrame{
	
	public BorderDemo(){
		setTitle("Border Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new GridLayout(5, 0));

		JPanel lineBorderPanel = new JPanel();
		lineBorderPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		add(lineBorderPanel);
		
		JPanel titleBorderPanel = new JPanel();
		titleBorderPanel.setBorder(BorderFactory.createTitledBorder("This is title border"));
		add(titleBorderPanel);
		
		pack();
	}
	
	public static void main(String[] args) {
		new BorderDemo();
	}
}
