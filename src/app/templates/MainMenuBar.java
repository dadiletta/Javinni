package app.templates;
import javax.swing.*;


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
        m1.add(m11);
        m1.add(m22);
    }


    /**
     * Apparently this is needed
     */
    private static final long serialVersionUID = 1L;

}