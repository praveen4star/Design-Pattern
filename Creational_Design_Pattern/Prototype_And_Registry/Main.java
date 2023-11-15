package Creational_Design_Pattern.Prototype_And_Registry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void compare(List<Shape> shapes1, List<Shape> shapes2){
        for (Shape value : shapes1) {
            for (Shape shape : shapes2) {
                if (value.equals(shape)) {
                    System.out.println("Object is equals");
                } else {
                    System.out.println("Object is not equals");
                }
            }
        }
    }
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle c = new Circle();
        c.x = 1;
        c.y = 2;
        c.color = "Red";
        c.radius = 2;
        shapes.add(c);
        Rectangle rectangle = new Rectangle();
        rectangle.width  = 2;
        rectangle.height=4;
        rectangle.color = "Yellow";
        rectangle.x = 22;
        rectangle.y = 23;
        shapes.add(rectangle);
        List<Shape> copiedShapes = new ArrayList<>();
        for(Shape shape : shapes){
            copiedShapes.add(shape.clone());
        }

        compare(shapes, copiedShapes);
    }
}
