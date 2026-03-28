public class Demo {
    public static void main(String[] args) {
        AbstractFactory shapefactory = FactoryProducer.getFactory("Circle");

        Shape circle = shapefactory.getShape("Circle");
        circle.draw();

        Shape rectangle = shapefactory.getShape("Rectangle");
        rectangle.draw();

        Shape square = shapefactory.getShape("Square");
        square.draw();

        AbstractFactory colorfactory = FactoryProducer.getFactory("Color");

        Color color = colorfactory.getColor("Red");
        color.fill();

        Color color2 = colorfactory.getColor("Blue");
        color2.fill();

        Color color3 = colorfactory.getColor("Green");
        color3.fill();

    }
}
