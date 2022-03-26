import javax.swing.*;
import java.awt.*;
// Called by SimpleGUI2 to create a panel and use the paintComponent method
public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        // Imagine 'g' as a painting machine, you tell it the color and the shape to paint (coordinates and size)
        // Fills the entire background of the frame (commented out because using black on line 19)
//        g.setColor(Color.orange);
//        g.fillRect(20, 50, 100, 100);

        // Display a jpeg - Not used in SimpleGUI2, just here for reference
//        Image image = new ImageIcon("./data/cat.jpeg").getImage();
//        // The x,y coordinates for where top-left corner goes. Relative to the widget (JPanel subclass), not the frame
//        g.drawImage(image, 3, 4, this);

        // Paint a randomly-colored circle on a black background
        // Fill background with black. x,y is upper-left corner, relative to the panel
        // width and height is saying: "make the width of this rect as wide/high as the panel"
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        // Random color generator
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        // x,y is top-left corner offset, width, height (all in pixels)
        g.fillOval(75, 75, 100, 100);
    }
}
