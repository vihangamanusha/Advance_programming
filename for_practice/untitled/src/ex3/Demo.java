package ex3;

public class Demo {
    public static void main(String[] args) {
        Dog d = new Dog(24,"red");

        MySerilaizer m = new MySerilaizer();
        m.serilizer(d);

        MyDeserilizer m2 = new MyDeserilizer();
        m2.desriizer();
    }
}
