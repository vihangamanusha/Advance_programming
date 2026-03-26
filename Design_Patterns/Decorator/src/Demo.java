public class Demo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.ShowDescription());

        LaptopSSD laptopSSD=new LaptopSSD(laptop);
        System.out.println(laptopSSD.ShowDescription());

        LaptopDVD laptopDVD=new LaptopDVD(laptop);
        System.out.println(laptopDVD.ShowDescription());

        Laptop dvd_ssd=new LaptopDVD(new LaptopSSD(laptop));
        System.out.println(dvd_ssd.ShowDescription());
    }

}
