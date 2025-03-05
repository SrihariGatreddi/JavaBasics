package AWTPROG;
import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NameApplet extends Applet {
    private String name = "Your Name";
    private int x = 50;
    private int y = 50;

    @Override
    public void init() {
        // Add mouse listener to handle mouse clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Update the position to the location of the mouse click
                x = e.getX();
                y = e.getY();
                // Repaint the applet to draw the name at the new position
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // Draw the name at the specified position
        g.drawString(name, x, y);
    }
}

