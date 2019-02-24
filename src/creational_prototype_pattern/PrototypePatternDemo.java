package creational_prototype_pattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        try {
            ShapeCache.loadCache();

            Shape_Prototype clonedShape = (Shape_Prototype) ShapeCache.getShape("1");
            System.out.println("Shape : " + clonedShape.getType());

            Shape_Prototype clonedShape2 = (Shape_Prototype) ShapeCache.getShape("2");
            System.out.println("Shape : " + clonedShape2.getType());

            Shape_Prototype clonedShape3 = (Shape_Prototype) ShapeCache.getShape("3");
            System.out.println("Shape : " + clonedShape3.getType());
        }catch (CloneNotSupportedException exception){
            System.out.println(exception.getMessage());
        }
    }
}
