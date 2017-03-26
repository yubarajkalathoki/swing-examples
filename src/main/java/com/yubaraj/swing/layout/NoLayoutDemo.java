package com.yubaraj.swing.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class NoLayoutDemo {
	String username;
	String password;
	JTextField userTextField;
	JPasswordField passwordTextField;

	public static void main(String[] args) {
		NoLayoutDemo loginView = new NoLayoutDemo();

		JFrame frame = new JFrame("LoginView application");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		loginView.placeComponents(panel);

		frame.setVisible(true);

	}

	private void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		userTextField = new JTextField(20);
		userTextField.setBounds(100, 10, 160, 25);
		panel.add(userTextField);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		passwordTextField = new JPasswordField(20);
		passwordTextField.setBounds(100, 40, 160, 25);
		panel.add(passwordTextField);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);

		// Setting event when button clicked.
		ActionListener loginButtonListener = new LoginButtonListener();
		loginButton.addActionListener(loginButtonListener);

	}

	public class LoginButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Getting values from input fields.
			username = userTextField.getText();
			password = passwordTextField.getText();
			JOptionPane.showMessageDialog(null,
					"You entered following values.\n Username: " + username + "\n Password: " + password);
		}
	}
}
