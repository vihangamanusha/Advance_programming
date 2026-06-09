package Design_patterns.Decarator;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.showDescription());

        LaptopSSD ssd=new LaptopSSD(laptop);
        System.out.println(ssd.showDescription());

        LaptopDVD dvd=new LaptopDVD(laptop);
        System.out.println(dvd.showDescription());
    }
}
