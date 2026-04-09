package ex3;

public class Dog extends Animal {
    private String color;

    public Dog(double weight,String color) {
        super(weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color: " + color+", weight: " + getWeight();
    }
}
