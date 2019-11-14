/*
Javinni is a starting point for Java GUI apps using the Swing library. 
It implements the following guides:
- https://www.guru99.com/java-swing-gui.html
- https://gilmour.online/compsci/ap-computer-science
*/
package app; // always declare your package first

// JAVA IMPORTS
import java.awt.*;
import javax.swing.*;

// LOCAL IMPORTS
import app.templates.*;
import app.models.*;

public class App {
    
    // STATIC INSTANCE VARIABLES TO MAKE THINGS MORE ACCESSIBLE
    private static JFrame frame;
    public static JTextArea textFeed; // not following the best practices of encapsulation
    public static JPanel topPanel; // not following the best practices of encapsulation
    public static JPanel gameControls; // not following the best practices of encapsulation
    /**
     * App launcher
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // FRAME BASICS
        frame = new JFrame("Javinni"); // title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close option
        frame.setSize(400, 400); // starting size

        // Instantiate our custom menu from templates/MainMenuBar.java
        JMenuBar menu = new MainMenuBar();
        // Instantiate our custom JPanel from templates/GameControls.java
        gameControls = new GameControls(); 
        topPanel = new TopPanel();
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEADING));
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(menu);
        top.add(topPanel);
        // Text Area at the Center
        
        textFeed = new TextFeed();
        JScrollPane scroll = new JScrollPane (textFeed, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, gameControls);
        frame.getContentPane().add(BorderLayout.NORTH, top);
        frame.getContentPane().add(BorderLayout.CENTER, scroll);
        frame.setVisible(true);
    }

    /**
     * Mutator for the private text area. Appends given text to area. 
     * @param text
     */
    public static void addText(String text){
        textFeed.append(text + "\n");
    }

}