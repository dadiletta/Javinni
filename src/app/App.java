/*
Javinni is a starting point for Java GUI apps using the Swing library. 
It implements the following guides:
- https://www.guru99.com/java-swing-gui.html
- https://gilmour.online/compsci/ap-computer-science
*/

package app;
import javax.swing.*;
import java.awt.*;

public class App {
    
    // STATIC INSTANCE VARIABLES TO MAKE THINGS MORE ACCESSIBLE
    private static JFrame frame;
    public static JTextArea ta;
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

        // Instantiate our custom menu from MenuBar.java
        JMenuBar mb = new MenuBar();
        // Instantiate our custom JPanel from ChatControls.java
        JPanel chatPanel = new ChatControls(); 
        
        // Text Area at the Center
        ta = new JTextArea();
        ta.setEditable(false);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, chatPanel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }

    /**
     * Mutator for the private text area. Appends given text to area. 
     * @param text
     */
    public static void addText(String text){
        ta.append(text + "\n");
    }


}