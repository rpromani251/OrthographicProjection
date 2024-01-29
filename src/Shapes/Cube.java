package src.Shapes;

import java.awt.Graphics;

import util.*;

public class Cube extends Shape {
    // Constructor:
    public Cube(int FRAME_WIDTH, int FRAME_HEIGHT) {
        super(FRAME_WIDTH, FRAME_HEIGHT);

        points = new Point[8];

        points[0] = new Point(FRAME_WIDTH*.375, FRAME_HEIGHT*.375, 0);
        points[1] = new Point(FRAME_WIDTH*.375, FRAME_HEIGHT*.625, 0);
        points[2] = new Point(FRAME_WIDTH*.625, FRAME_HEIGHT*.625, 0);
        points[3] = new Point(FRAME_WIDTH*.625, FRAME_HEIGHT*.375, 0);

        points[4] = new Point(FRAME_WIDTH*.375, FRAME_HEIGHT*.375, (int) depth);
        points[5] = new Point(FRAME_WIDTH*.375, FRAME_HEIGHT*.625, (int) depth);
        points[6] = new Point(FRAME_WIDTH*.625, FRAME_HEIGHT*.625, (int) depth);
        points[7] = new Point(FRAME_WIDTH*.625, FRAME_HEIGHT*.375, (int) depth);

        // points[8] = new Point(FRAME_WIDTH * .5 , FRAME_HEIGHT * .5, (int) (depth / 2));

        lines = new Line[12];

        lines[0] = new Line(points[0], points[1]);
        lines[1] = new Line(points[1], points[2]);
        lines[2] = new Line(points[2], points[3]);
        lines[3] = new Line(points[3], points[0]);

        lines[4] = new Line(points[4], points[5]);
        lines[5] = new Line(points[5], points[6]);
        lines[6] = new Line(points[6], points[7]);
        lines[7] = new Line(points[7], points[4]);

        lines[8] = new Line(points[0], points[4]);
        lines[9] = new Line(points[1], points[5]);
        lines[10] = new Line(points[2], points[6]);
        lines[11] = new Line(points[3], points[7]);

        // lines[12] = new Line(points[8], points[1]);
        // lines[13] = new Line(points[8], points[2]);
        // lines[14] = new Line(points[8], points[3]);
        // lines[15] = new Line(points[8], points[4]);
        // lines[16] = new Line(points[8], points[5]);
        // lines[17] = new Line(points[8], points[6]);
        // lines[18] = new Line(points[8], points[7]);
        // lines[19] = new Line(points[8], points[0]);
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
