public class Demo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.ShowDescription());

        LaptopSSD lapssd=new LaptopSSD(laptop);
        System.out.println(lapssd.ShowDescription());

        LaptopDVD laptopDVD = new LaptopDVD(laptop);
        System.out.println(laptopDVD.ShowDescription());

        Laptop dvd_ssd=new LaptopSSD(new LaptopDVD(laptop));
        System.out.println(dvd_ssd.ShowDescription());

    }
}
