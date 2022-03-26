import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI2 implements ActionListener {
    JFrame frame;

    // Main
    public static void main(String[] args) {
        SimpleGUI2 gui = new SimpleGUI2();
        gui.go();
    } // Main

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change Colors");
        button.addActionListener(this);

        //
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        // drawPanel added to the center.
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    } // go

    public void actionPerformed(ActionEvent event) {
        // When the user clicks, tells the frame to repaint itself. That means the paintComponent() is called on every widget in the frame (using paintComponent method from MyDrawPanel class)
        frame.repaint();
    } // actionPerformed

} // Class
