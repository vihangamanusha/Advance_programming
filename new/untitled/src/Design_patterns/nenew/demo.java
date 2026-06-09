package Design_patterns.nenew;

public class demo {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        System.out.println(laptop.showDescription());

        LaptopSSD ssd=new LaptopSSD(laptop);
        System.out.println(ssd.showDescription());

        LaptopDVD dvd=new LaptopDVD(ssd);
        System.out.println(dvd.showDescription());
    }
}
