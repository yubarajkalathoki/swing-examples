package com.yubaraj.swing.choice;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class JSliderDemo extends JFrame {
	public JSliderDemo() {
		setTitle("JSliderDemo Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

//		displaySlider();
		displaySliderWithPaintingTicks();

		pack();
	}

	private void displaySliderWithPaintingTicks() {
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		JPanel panel = new JPanel();
		panel.add(slider);
		add(panel);
	}

	private void displaySlider() {
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		JPanel panel = new JPanel();
		panel.add(slider);
		add(panel);
	}

	public static void main(String[] args) {
		new JSliderDemo();
	}
}
