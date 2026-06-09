package Design_patterns.nenew;

public class LaptopDVD extends LaptopDecorator {
    private Laptop blap;

    public LaptopDVD(Laptop blap) {
        this.blap=blap;
    }

    public String showDescription() {
        return blap.showDescription()+ " with dvd";
    }
}
