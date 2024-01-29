package src;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Initialize JFrame and instance of Application class
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create JFrame
                JFrame frame = new JFrame("Orthographic 3D Cube Projection");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create instance of Application and add it to the main frame, making it focusable
                Application app = new Application();
                frame.add(app);
                app.setFocusable(true);

                // Create the menu bar
                JMenuBar menuBar = new JMenuBar();

                JMenu shapeMenu = new JMenu("Shapes");
                menuBar.add(shapeMenu);

                JMenu functionMenu = new JMenu("Functions");
                menuBar.add(functionMenu);

                /*-------------------------- Add to the Function Bar -------------------------- */

                JMenuItem toggleRotation = new JMenuItem("Toggle Rotations");
                toggleRotation.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        app.toggleRotation();
                    }
                });
                functionMenu.add(toggleRotation);

                JMenuItem incrementPointSize = new JMenuItem("Increment Point Size");
                incrementPointSize.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        app.incrementPointSize();
                    }
                });
                functionMenu.add(incrementPointSize);

                JMenuItem decrementPointSize = new JMenuItem("Decrement Point Size");
                decrementPointSize.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        app.decrementPointSize();
                    }
                });
                functionMenu.add(decrementPointSize);

                /*-------------------------- Add Shapes to the Menu Bar -------------------------- */

                JMenuItem cubeItem = new JMenuItem("Cube");
                cubeItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        app.setCube();
                    }
                });
                shapeMenu.add(cubeItem);

                JMenuItem squarePyramidItem = new JMenuItem("Square Pyramid");
                squarePyramidItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        app.setSquarePyramid();
                    }
                });
                shapeMenu.add(squarePyramidItem);

                JMenuItem sphereItem = new JMenuItem("Sphere");
                sphereItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        app.setSphere();
                    }
                });
                shapeMenu.add(sphereItem);

                // Set the menu bar for the frame
                frame.setJMenuBar(menuBar);
                
                

                // Pack, make visible, and set the main frame to be unresizable
                frame.pack();
                frame.setVisible(true);
                frame.setResizable(false);

                // Loop:
                Timer timer = new Timer(10, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        app.Rotate();
                        frame.repaint();
                    }
                });
                timer.start();
            }
        });
    }
}
