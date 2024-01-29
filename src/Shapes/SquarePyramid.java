package src.Shapes;

import java.awt.Graphics;

import util.*;

public class SquarePyramid extends Shape {
    // Constructor:
    public SquarePyramid(int FRAME_WIDTH, int FRAME_HEIGHT) {
        super(FRAME_WIDTH, FRAME_HEIGHT);

        points = new Point[5];

        points[0] = new Point(FRAME_WIDTH*.375, FRAME_HEIGHT*.375, 0);
        points[1] = new Point(FRAME_WIDTH*.375, FRAME_HEIGHT*.625, 0);
        points[2] = new Point(FRAME_WIDTH*.625, FRAME_HEIGHT*.625, 0);
        points[3] = new Point(FRAME_WIDTH*.625, FRAME_HEIGHT*.375, 0);
        points[4] = new Point(FRAME_WIDTH*.5, FRAME_HEIGHT*.5, depth/2);

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
