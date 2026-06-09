package Design_patterns.Factory;

public class ShapeFactory {
    public Shape getShape(String type){
        if(type.equals("Rectangle")){
            return new Rectangle();
        } else if (type.equals("Square")) {
            return new Square();

        }else if (type.equals("Circle")) {
            return new Circle();
        }
        return null;
    }
}