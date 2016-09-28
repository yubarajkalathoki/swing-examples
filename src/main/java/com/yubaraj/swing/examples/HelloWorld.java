package com.yubaraj.swing.examples;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This class displays helloworld message in JFrame. 
 *
 * @author Yuba Raj Kalathoki
 */
public class HelloWorld {

    public static void main(String[] args) {
        /**
         * Displaying name of frame.
         */
        JFrame mainFrame = new JFrame("Hello World!");
        /**
         * Frame exists if we set default colse operation as exis on close.
         */
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * Setting frame size width 400 and height 300
         */
        mainFrame.setSize(400, 300);
        /**
         * Creating label to display hello world message in frame.
         */
        JLabel helloWorld = new JLabel("Hello World");
        /**
         * Adding helloWorld label in frame to display. If we don't add in frame
         * this label will not be displayed.
         */
        mainFrame.add(helloWorld);
        /**
         * Setting visible true means frame will be displayed. If we dis not set
         * it frame will not be displayed.
         */
        mainFrame.setVisible(true);
    }
}
