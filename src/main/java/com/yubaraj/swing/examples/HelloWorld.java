package com.yubaraj.swing.examples;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class HelloWorld {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Hello World!");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        
        JLabel helloWorld = new JLabel("Hello World");
        
        mainFrame.add(helloWorld);
        mainFrame.setVisible(true);
    }
}
