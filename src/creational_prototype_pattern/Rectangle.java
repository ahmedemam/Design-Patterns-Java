package creational_prototype_pattern;

public class Rectangle extends Shape_Prototype {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("> Inside Rectangle::draw() method...");
    }
}
