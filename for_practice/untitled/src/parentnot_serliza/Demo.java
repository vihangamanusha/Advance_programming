package parentnot_serliza;

public class Demo {
    public static void main(String[] args) {
        UniEmployee uni = new UniEmployee("vihanga",24,1388);

        Myserilizer msr1 = new Myserilizer();
        msr1.myserilizer(uni);

        Mydeserilizer msr2 = new Mydeserilizer();
        msr2.mydeserilizer();
    }
}
