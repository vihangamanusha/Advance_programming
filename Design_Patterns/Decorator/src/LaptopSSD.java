public class LaptopSSD extends Decorator {
    private Laptop laptop;

    public LaptopSSD(Laptop laptop) {
        this.laptop = laptop;
    }

    public String ShowDescription() {
        return laptop.ShowDescription()+" with SSD";
    }
}
