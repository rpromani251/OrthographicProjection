package src.Shapes;

import java.awt.Graphics;

import util.*;

public class Sphere extends Shape {
    // Constructor:
    public Sphere(int FRAME_WIDTH, int FRAME_HEIGHT) {
        super(FRAME_WIDTH, FRAME_HEIGHT);

        final double RADIUS = FRAME_WIDTH * 0.125;

        points = new Point[26];

        // Approximating Circle using Euler's Method:
        double x = FRAME_WIDTH / 2.0; // x0 = center of window
        double y = FRAME_HEIGHT / 2.0 - RADIUS; // y0 = center of window + height of radius
        double dydx = 0;

        for (int i = 0; i < 25; i++) {


            x += (RADIUS / 25.0); // 25 Steps --> Add 1/25 of radius each step
            y += Math.sqrt(RADIUS*RADIUS - x*x); // 25 Steps --> Add 1/25 of 

            points[i] = new Point(x, y, 0);
        } 

        points[25] = new Point(FRAME_WIDTH / 2.0, FRAME_HEIGHT / 2.0, 0);

        lines = new Line[8];

        lines[0] = new Line(points[0], points[1]);
        lines[1] = new Line(points[1], points[2]);
        lines[2] = new Line(points[2], points[3]);
        lines[3] = new Line(points[3], points[0]);

        lines[4] = new Line(points[0], points[4]);
        lines[5] = new Line(points[1], points[4]);
        lines[6] = new Line(points[2], points[4]);
        lines[7] = new Line(points[3], points[4]);
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
