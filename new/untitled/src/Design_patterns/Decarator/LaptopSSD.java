package Design_patterns.Decarator;

public class LaptopSSD extends LaptopDecorator{
    private Laptop blap;

    public LaptopSSD(Laptop blap) {
        this.blap = blap;
    }


    public String showDescription(){
        return blap.showDescription()+" with ssd ";
    }
}
