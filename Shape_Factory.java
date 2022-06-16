package Factory_Design_Pattern;

public class Shape_Factory {
    
    public static Shape_interface getShape(String shape){

        if(shape==null){
            return null;
        }

        if(shape=="Circle"){
            Shape_interface s=new Conceter_Circle();
            return s;
        }
        else if(shape=="Rectangle"){
            Shape_interface s=new concrete_rectangle();
            return s;
        }
        else{
            Shape_interface s=new concrete_square();
            return s;
        }
    }

}
