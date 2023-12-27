public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;
        int numPoints = points.length;

        for (int i = 0; i < numPoints; i++) {
            int nextIndex = (i + 1) % numPoints;
            perimeter += points[i].distanceTo(points[nextIndex]);
        }
        return perimeter;
    }

    // getAverageSide()
    public double getAverageSide() {
        double totalLength = 0;
        int numsides = points.length;

        for (int i = 0; i < numsides; i++) {
            int nextIndex = (i + 1) % numsides;
            totalLength += points[i].distanceTo(points[nextIndex]);
        }
        return totalLength / numSides;
    }

    // getLongestSide()
    public double getLongest() {
        double maxLength = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = points[i].distanceTo(points[j]);
                if (distance > maxLength) {
                    maxLength = distance;
                }
            }
        }
        return maxLength;
    }
}