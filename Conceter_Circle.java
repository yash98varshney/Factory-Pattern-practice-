package Factory_Design_Pattern;

public class Conceter_Circle implements Shape_interface {

        
    public void draw(){
        System.out.println("Circle is drawn");
    }

    public int area(){
        int radius=5;
        int area=(int)(3*radius*radius);
        return area;
    }

    
    public int parimeter(){
        int radius=5;
        int par=2*3*radius;
        return par;
        
    }


}
