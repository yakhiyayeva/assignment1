package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest) {
        double deltaX = this.x - dest.x;
        double deltaY = this.y - dest.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    // toString
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
