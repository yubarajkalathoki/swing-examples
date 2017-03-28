package com.yubaraj.swing.choice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JRadioButtonDemo extends JFrame {
	JRadioButton maleRadioButton;
	JRadioButton femaleRadioButton;

	public JRadioButtonDemo() {
		setTitle("JRadioButton Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());

		maleRadioButton = new JRadioButton("Male");
		femaleRadioButton = new JRadioButton("Female");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(maleRadioButton);
		buttonGroup.add(femaleRadioButton);

		add(maleRadioButton);
		add(femaleRadioButton);

		pack();
		
//		adding action listener for buttons
		maleRadioButton.addActionListener(new RadioButtonActionListener());
		femaleRadioButton.addActionListener(new RadioButtonActionListener());

	}

	class RadioButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			JRadioButton button = (JRadioButton) event.getSource();
			if (button == maleRadioButton) {
				JOptionPane.showMessageDialog(null, "Male Selected!");
			} else if (button == femaleRadioButton) {
				JOptionPane.showMessageDialog(null, "Male Selected!");
			}
		}
	}

	public static void main(String[] args) {
		new JRadioButtonDemo();
	}

}
