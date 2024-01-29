package src.Shapes;

import java.awt.Graphics;

import util.*;

public class Sphere extends Shape {
    // Constructor:
    public Sphere(int FRAME_WIDTH, int FRAME_HEIGHT) {
        super(FRAME_WIDTH, FRAME_HEIGHT);

        final double RADIUS = FRAME_WIDTH * 0.125;
        final double THETA = 2*Math.PI/25;

        points = new Point[76];

        double deltaX = RADIUS / 5;
        double x = FRAME_WIDTH / 2.0 - deltaX / 2; // x0 = center of window
        double y = FRAME_HEIGHT / 2.0 - RADIUS + deltaX; // y0 = center of window + height of radius

        for (int i = 0; i < 25; i++) { 

            y += deltaX * Math.sin(i*THETA);
            x += deltaX * Math.cos(i*THETA);

            points[i+25] = new Point(x, y, 0);
        }

        double z = -RADIUS + 10 * deltaX / 11; // y0 = center of window + height of radius
        y = FRAME_HEIGHT / 2.0; // y0 = center of window + height of radius
        x = FRAME_WIDTH / 2.0 - deltaX / 2; // x0 = center of window

        for (int i = 0; i < 25; i++) {

            z += deltaX * Math.sin(i*THETA);
            x += deltaX * Math.cos(i*THETA);

            points[i] = new Point(x, y, z);
        }

        z = - deltaX / 2; // y0 = center of window + height of radius
        y = FRAME_HEIGHT / 2.0 - 4 * RADIUS / 5; // y0 = center of window + height of radius
        x = FRAME_WIDTH / 2.0; // x0 = center of window

        for (int i = 0; i < 25; i++) {

            y += deltaX * Math.sin(i*THETA);
            z += deltaX * Math.cos(i*THETA);

            points[i+50] = new Point(x, y, z);
        }

        points[75] = new Point(FRAME_WIDTH / 2.0, FRAME_HEIGHT / 2.0, 0);

        lines = new Line[75];

        for (int i = 0; i < 24; i++) {
            lines[i] = new Line(points[i], points[i+1]);
        }
        lines[24] = new Line(points[24], points[0]);

        for (int i = 25; i < 49; i++ ) {
            lines[i] = new Line(points[i], points[i+1]);
        }
        lines[49] = new Line(points[49], points[25]);

        for (int i = 50; i < 74; i++ ) {
            lines[i] = new Line(points[i], points[i+1]);
        }
        lines[74] = new Line(points[74], points[50]);
        
    }

    // Rotation Method
    @Override
    public void Rotate(double angle) {
        super.Rotate(angle);
    }

    // Find Centroid
    @Override
    public Point findCentroid() {
        return super.findCentroid();
    }
    
    // Project Point
    @Override
    public void projectPoint(Point p) {
        super.projectPoint(p);
    }

    // Draw Method
    public void draw(Graphics g) {
        super.draw(g);
    }
}
