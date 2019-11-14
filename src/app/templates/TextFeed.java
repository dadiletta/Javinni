package app.templates;

// JAVA IMPORTS
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// LOCAL IMPORTS
import app.App; // connect to the static class from another package

/**
 * Menu bar to send input into the main window's text area
 */
public class TextFeed extends JTextArea {

    /**
     * An identifer VSCode apparently requires
     */
    private static final long serialVersionUID = 7143095341280794378L;

    /**
     * Assembles the menu bar for our app
     */
    public TextFeed(){

        this.setEditable(false);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        
    }

}