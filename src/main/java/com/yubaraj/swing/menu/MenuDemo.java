package com.yubaraj.swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Yubaraj
 */
public class MenuDemo {

    public MenuDemo() {
        JFrame frame = new JFrame("Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JMenuBar menuBar = new JMenuBar();//create jmenu bar

        JMenu fileMenu = new JMenu("File");//create filemenu
        menuBar.add(fileMenu);//add filemenu into menu bar
        //preparing icon for new menu item
        ImageIcon labelIcon = new ImageIcon("C:\\Users\\Yuba Raj Kalathoki\\Pictures\\JamesGosling.jpg", "James Gosling");
        JLabel lbl = new JLabel(labelIcon);
        frame.add(lbl);

        ImageIcon newImageIcon = new ImageIcon("C:\\Users\\Yuba Raj Kalathoki\\Pictures\\file-new-icon.png");
//        adding menuitems for file menu
        JMenuItem newMenuItem = new JMenuItem("New", newImageIcon);
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        fileMenu.add(newMenuItem);

        ImageIcon openImageIcon = new ImageIcon("C:\\Users\\Yuba Raj Kalathoki\\Pictures\\open-file-icon.png");
        JMenuItem openMenuItem = new JMenuItem("Open", openImageIcon);
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK);
        openMenuItem.setAccelerator(keyStroke);
        fileMenu.add(openMenuItem);

        JMenu editMenu = new JMenu("Edit");//create edit menu
        menuBar.add(editMenu);//add edit menu in menubar

        frame.setJMenuBar(menuBar);//add j in with setjmenubar method
        frame.setVisible(true);
        openDialogForNewMenuItem(newMenuItem);
    }

    void openDialogForNewMenuItem(JMenuItem newMenuItem) {
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "New menu item clicked.");
            }
        });
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
