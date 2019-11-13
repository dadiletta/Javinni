package app;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ChatControls extends JPanel {

    /**
     * Assembles the menu bar for our app
     */
    public ChatControls(){
        
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters

        // SEND BUTTON
        JButton send = new JButton("Send");
        // create action when send button is clicked
        send.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                App.addText(tf.getText());
                tf.setText("");
            }
        });

        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                App.ta.setText("");
            }
        });


        // ADD PARTS TO ELEMENT
        this.add(label); // Components Added using Flow Layout
        this.add(label); // Components Added using Flow Layout
        this.add(tf);
        this.add(send);
        this.add(reset);
    }


    /**
     * Apparently this is needed
     */
    private static final long serialVersionUID = 1L;

}