public class Demo {
    public static void main(String[] args) {
        MyDBConnection_1 m1=MyDBConnection_1.getInstance();
        MyDBConnection_2 m2=MyDBConnection_2.getInstance();

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        MyDBConnection_3 m3=MyDBConnection_3.getInstance();
        MyDBConnection_4 m4=MyDBConnection_4.getInstance();

        System.out.println(m3.hashCode());
        System.out.println(m4.hashCode());

        MyDBConnection_5 m5=MyDBConnection_5.getInstance();
        System.out.println(m5.hashCode());

    }
}
