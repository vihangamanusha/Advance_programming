public class LaptopSSD extends Decorator{
    private Laptop lap;

    public LaptopSSD(Laptop lap) {
        this.lap = lap;
    }

    public String showDescription() {
        return lap.showDescription()+" SSD";
    }
}

