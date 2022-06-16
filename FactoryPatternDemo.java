package Factory_Design_Pattern;

public class FactoryPatternDemo {
    
    public static void main(String[] args){
        Shape_interface shape=Shape_Factory.getShape("Square");
        shape.draw();
    }
}
