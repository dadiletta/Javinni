package app.templates;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

// LOCAL IMPORTS
import app.App; // connect to the static class from another package


public class MainMenuBar extends JMenuBar {

    /**
     * Assembles the menu bar for our app
     */
    public MainMenuBar(){
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        this.add(m1);
        this.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");

        // SHOW OPTIONS MENU ITEM
        JMenuItem optionsItem = new JMenuItem("Options");
        optionsItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                App.options.setVisible(true);
            }
        });

        m1.add(m11);
        m1.add(m22);
        m1.add(optionsItem);
    }


    /**
     * Apparently this is needed
     */
    private static final long serialVersionUID = 1L;

}