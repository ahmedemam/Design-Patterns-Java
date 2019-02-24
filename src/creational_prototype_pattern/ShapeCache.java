package creational_prototype_pattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape_Prototype> shapeMap = new Hashtable<String, Shape_Prototype>();

    public static Shape_Prototype getShape(String shapeId) throws CloneNotSupportedException {
        Shape_Prototype cachedShape = shapeMap.get(shapeId);
        return (Shape_Prototype) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
