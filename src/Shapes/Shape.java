package src.Shapes;

import java.awt.Graphics;

import util.*;

public class Shape {
    protected Point[] points;
    protected Line[] lines;
    protected double depth;

    public Shape(int FRAME_WIDTH, int FRAME_HEIGHT) {
        depth = FRAME_WIDTH / 4;
    }
    // Rotation Method
    public void Rotate(double angle) {
        // Find the centroid of the cube:
        Point centroid = findCentroid();

        for (Point p : points) {
            // Translate point to the origin
            p = (Point) p.sub(centroid);
        }

        for (Point p : points) {
            // Rotate the point about the x, y, and z axes
            p.RotateX(angle);
            p.RotateY(angle);
            p.RotateZ(angle);
        }

        for (Point p : points) {
            // Translate point back
            p = (Point) p.add(centroid);
            // projectPoint(p);5
        }
    }

    // Find Centroid
    protected Point findCentroid() {
        double sumX = 0, sumY = 0, sumZ = 0;
        for (Point p : points) {
            sumX += p.x;
            sumY += p.y;
            sumZ += p.z;
        }
        int numPoints = points.length;
        return new Point(sumX / numPoints, sumY / numPoints, sumZ / numPoints);
    }

    // Project Point
    protected void projectPoint(Point p) {
        double distance = 2;
        double z = 1 - (distance);
        double[][] projectionMatrix = {
            {z, 0, 0},
            {0, z, 0},
            {0, 0, 0}
        };
        p.set(Matrix.matmul(projectionMatrix, p));
    }

    // Draw Method
    public void draw(Graphics g) {
        for (Point point : points) {
            point.draw(g);
        }
        for (Line line : lines) {
            // line.draw(g);
        }
    }
}
