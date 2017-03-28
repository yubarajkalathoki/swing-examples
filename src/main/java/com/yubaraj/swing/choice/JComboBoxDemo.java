package com.yubaraj.swing.choice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JComboBoxDemo extends JFrame {

	public JComboBoxDemo() {
		setTitle("JComboBoxDemo Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JComboBox<String> jComboBox = createComboBoxWithArrayOfItem();
		// JComboBox<String> jComboBox=createComboBoxAndAddValues();
		pack();

		/*
		 * Adding events
		 */
		jComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> combo = (JComboBox<String>) e.getSource();
				String selectedName = (String) combo.getSelectedItem();
				JOptionPane.showMessageDialog(null, "Selected: " + selectedName);
			}
		});
	}

	public JComboBox<String> createComboBoxWithArrayOfItem() {
		// define items in a String array:
		String[] names = new String[] { "Rojina", "Alisha", "Sanjay", "Deependra", "Manan" };

		// create a combo box with the fixed array:
		JComboBox<String> comboName = new JComboBox<String>(names);
		add(comboName);
		return comboName;
	}

	public JComboBox<String> createComboBoxAndAddValues() {
		// create an empty combo box with items of type String
		JComboBox<String> comboName = new JComboBox<String>();

		// add items to the combo box
		comboName.addItem("Rojina");
		comboName.addItem("Alisha");
		comboName.addItem("Sanjay");
		comboName.addItem("Deependra");
		comboName.addItem("Manan");

		add(comboName);
		return comboName;
	}

	public static void main(String[] args) {
		new JComboBoxDemo();
	}

}
