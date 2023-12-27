import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Huawei\\Desktop\\AssignmentOne\\src\\source.txt");

        Scanner sc = new Scanner(file);
        // Create an array of points
        Point[] points = {
                new Point(3, 4),
                new Point(5, 6),
                new Point(1, 2),
                new Point(6, 8)
        };

        Shape shape = new Shape(points);

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongest());

    }
}
