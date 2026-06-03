package Serialization.EX_03;

public class Dog extends Animal {
    private String color;

    public Dog (double weight, String color) {
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
        return "Dog [color=" + color + "weight="+getWeight() +" ";
    }
}
