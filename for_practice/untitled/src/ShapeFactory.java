public class ShapeFactory {
    public Shape getShape(String shapeName) {
        if(shapeName==null)return null;

        if(shapeName.equals("Rectangle")){
            return new Rectangle();
        }else if(shapeName.equals("Square")){
            return new Square();
        } else if (shapeName.equals("Circle")) {
            return new Circle();
        }return null;
    }
}
