package creational_prototype_pattern;

public class Circle extends Shape_Prototype{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("> Inside Circle::draw() method...");
    }
}
