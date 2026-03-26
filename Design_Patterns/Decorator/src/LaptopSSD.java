public class LaptopSSD extends Decorator {
    private Laptop Laptop;

    public LaptopSSD(Laptop Laptop) {
        this.Laptop = Laptop;
    }

    public String ShowDescription() {
        return Laptop.ShowDescription()+" with SSD";
    }
}
