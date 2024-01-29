package src;
import javax.swing.*;

import src.Shapes.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Application extends JPanel {
    // Window Size: 
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 800;

    // Rotation Stuff:
    private final double ANGLE = .025;
    public boolean rotation;

    // Class Declarations
    private Shape currentShape;
    private Cube cube;
    private SquarePyramid squarePyramid; 
    private Sphere sphere;

    // Constructor: 
    public Application() {
        // Set Default Values:
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        rotation = false; // change 

        // Create instance of cube:
        currentShape = new Sphere(FRAME_WIDTH, FRAME_HEIGHT);
    }

    // Rotation Method:
    public void Rotate() {
        if (currentShape != null && rotation) {
            currentShape.Rotate(ANGLE);
        }
    }

    // Override paintComponent method
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (currentShape != null) {
            currentShape.draw(g);
        }
    }

    /*-------------------------- Menu Bar Functions -------------------------- */

    // Set Cube
    public void setCube() {
        if (cube == null) {
            cube = new Cube(FRAME_WIDTH, FRAME_HEIGHT);

            // Set other shapes to be null
            squarePyramid = null;
            sphere = null;
        }
        currentShape = cube;
        repaint(); // Repaint to update the view
    }
    
    // Set Square Pyramid
    public void setSquarePyramid() {
        if (squarePyramid == null) {
            squarePyramid = new SquarePyramid(FRAME_WIDTH, FRAME_HEIGHT);

            // Set other shapes to be null
            cube = null;
            sphere = null;
        }
        currentShape = squarePyramid;
        repaint(); // Repaint to update the view
    }
    
    // Set Sphere
    public void setSphere() {
        if (sphere == null) {
            sphere = new Sphere(FRAME_WIDTH, FRAME_HEIGHT);

            // Set other shapes to be null
            cube = null;
            squarePyramid = null;
        }
        currentShape = sphere;
        repaint(); // Repaint to update the view
    }

    // Toggle Rotation
    public void toggleRotation() {
        rotation = !rotation;
    }

    // Increment Point Size
        public void incrementPointSize() {
            if (Point.size + 2 < Point.maxSize) {
                Point.size += 2;
            }
        }
    // Decrement Point Size
        public void decrementPointSize() {
            if (Point.size - 2 > Point.minSize) {
                Point.size -= 2;
            }
        }
}

