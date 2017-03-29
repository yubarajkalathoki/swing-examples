package com.yubaraj.swing.menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

/**
 *
 * @author Yubaraj
 */
public class JToolBarDemo {

    public JToolBarDemo() {
        JFrame frame = new JFrame("Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JToolBar toolBar = new JToolBar("New");
        
        JButton newButton = new JButton(new ImageIcon("C:\\Users\\Yuba Raj Kalathoki\\Pictures\\file-new-icon.png"));
        newButton.setToolTipText("Open new.. Ctrl+N");
        toolBar.add(newButton);
        
        JButton openButton = new JButton(new ImageIcon("C:\\Users\\Yuba Raj Kalathoki\\Pictures\\open-file-icon.png"));
        toolBar.add(openButton);
        
        frame.add(toolBar);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JToolBarDemo();
    }
}
