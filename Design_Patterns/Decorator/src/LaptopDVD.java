import java.awt.*;

public class LaptopDVD extends Decorator{
    private Laptop laptop;

    public LaptopDVD(Laptop laptop) {
        this.laptop=laptop;
    }

    public String ShowDescription() {
        return laptop.ShowDescription()+" with DVD";
    }
}
