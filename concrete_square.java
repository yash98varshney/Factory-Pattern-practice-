package Factory_Design_Pattern;

public class concrete_square implements Shape_interface {
   
    
    @Override
    public void draw(){
        System.out.println("Drawing Square");
    }

    @Override
    public int area(){
        return 2*2;
    }

    @Override
    public int parimeter(){
        return 4*2;
    }
}
