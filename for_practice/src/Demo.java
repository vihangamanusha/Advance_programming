public class Demo {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        System.out.println(lap.showDescription());

        LaptopSSD lapssd=new LaptopSSD(lap);
        System.out.println(lapssd.showDescription());

        LaptopDVD lapdvd=new LaptopDVD(lap);
        System.out.println(lapdvd.showDescription());

        Laptop dvdssd=new LaptopSSD(new LaptopDVD(lap));
        System.out.println(dvdssd.showDescription());
    }
}
