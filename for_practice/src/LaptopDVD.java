public class LaptopDVD extends Decorator{
    private Laptop lap;

    public LaptopDVD(Laptop lap) {
        this.lap = lap;
    }

    @Override
    public String showDescription() {
        return lap.showDescription()+" with dvd";
    }
}
