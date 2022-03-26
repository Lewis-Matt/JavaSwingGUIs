import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI1 implements ActionListener {     // An instance of SimpleGUI 'is-a' ActionListener:
    JButton button;                                     // the button will give events only to ActionListener implementers

    public void go() {
        // JFrame is the objects that represents a window on the screen
        JFrame frame = new JFrame();
        // Call button constructor to create a new button with a text label
        button = new JButton("click me");
        // This says to the button: "Add me to your list of listeners." The arg passed MUST be an object from a class that implements ActionListener:
        // 'this' refers to the object it is contained within (SimpleGUI1), which implements ActionListener.
        // The button listens for any actionPerformed(), when clicked,that is contained in the class.
        button.addActionListener(this);
        // Adding the button to the JFrame Pane (think of the frame as a window frame and adding things to window pane)
        // Note that this isn't the way it should be done, as a frame has 5 regions, and you should specify the region.
            // .add(BorderLayout.CENTER, button); is how it should be.
        frame.getContentPane().add(button);
        // Makes the program quit when you close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Give the frame a size in pixels
        frame.setSize(300, 300);
        // Display the frame
        frame.setVisible(true);
    } // go

    // Implement the ActionListener interface's actionPerformed() method. This is the event-handling method!
    // The button calls this method to let you know an event happened. It sends an ActionEvent object as the arg, but we don't need it.
    // Knowing the event happened is enough info for this application. The ActionEvent object ('event') carries data about the event back to the listener.
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    } // actionPerformed

    // Main method
    public static void main(String[] args) {
        SimpleGUI1 gui = new SimpleGUI1();
        gui.go();
    } // main

} // class
