package app.templates; // always declare your package first

// JAVA IMPORTS
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

// LOCAL IMPORTS
import app.App; // connect to the static class from another package

/**
 * Menu bar to send input into the main window's text area
 */
public class TopPanel extends JPanel {

    /**
     * Assembles the menu bar for our app
     */
    public TopPanel(){
        this.setMaximumSize( new Dimension(
            Integer.MAX_VALUE,
            50
    ) );
        JLabel label = new JLabel("Level");

        
        // RESET BUTTON
        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                App.textFeed.setText("");
            }
        });

        // ADD PARTS TO ELEMENT
        this.add(label); // Components Added using Flow Layout
        this.add(reset);
    }


    /**
     * Apparently this is needed
     */
    private static final long serialVersionUID = 1L;

}