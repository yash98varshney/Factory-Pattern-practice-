package Factory_Design_Pattern;

public class concrete_rectangle implements Shape_interface {
    
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }

    @Override
    public int area(){
        return 2*3;
    }

    @Override
    public int parimeter(){
        return 2*(2+3);
    }
}
