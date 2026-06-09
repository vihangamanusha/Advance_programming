package Design_patterns.Decarator;

public class LaptopDVD {
    private Laptop blap;

    public LaptopDVD(Laptop blap) {
        this.blap = blap;
    }

    public String showDescription(){
        return blap.showDescription()+" with dvd ";
    }

}
