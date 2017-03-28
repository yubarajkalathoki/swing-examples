package com.yubaraj.swing.choice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Yubaraj
 *
 */
public class JCheckBoxDemo {
	public JCheckBoxDemo(){
		JFrame frame = new JFrame();
		frame.setTitle("JCheckBox Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		
		JCheckBox checkBox1 = new JCheckBox();
		checkBox1.setText("A");
		JCheckBox checkBox2 = new JCheckBox();
		checkBox2.setText("B");
		JCheckBox checkBox3 = new JCheckBox();
		checkBox3.setText("C");
		JCheckBox checkBox4 = new JCheckBox();
		checkBox4.setText("D");
		JCheckBox checkBox5 = new JCheckBox();
		checkBox5.setText("E");
		
		frame.add(checkBox1);
		frame.add(checkBox2);
		frame.add(checkBox3);
		frame.add(checkBox4);
		frame.add(checkBox5);
		frame.pack();
		
		
		addEvent(checkBox1);
	}
	
	
	private void addEvent(JCheckBox checkBox) {
		checkBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()){
					JOptionPane.showMessageDialog(null, "You checked Me!");
				}else{
					JOptionPane.showMessageDialog(null, "You unchecked Me!");
				}
			}
		});
	}


	public static void main(String[] args) {
		new JCheckBoxDemo();
	}
}
