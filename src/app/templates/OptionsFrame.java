package app.templates;


// JAVA IMPORTS
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

// LOCAL IMPORTS
import app.App; // connect to the static class from another package


/**
 *  Window to show options
 */
public class OptionsFrame extends JFrame {

    public OptionsFrame(){
        super("Options");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // close option
        this.setSize(200, 600);
        this.setVisible(false);
    }
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
}