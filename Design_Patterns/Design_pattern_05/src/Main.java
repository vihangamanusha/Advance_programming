public class Main {
    public static void main(String[] args) {
        MyDBConnection_1 mydb1 = MyDBConnection_1.getInstance();
        MyDBConnection_2 mydb2 = MyDBConnection_2.getInstance();

        System.out.println(mydb1.hashCode());
        System.out.println(mydb2.hashCode());

        MyDBConnecyion_3 mydb3 = MyDBConnecyion_3.getInstance();
        MyDBConnection_4 mydb4 = MyDBConnection_4.getInstance();

        System.out.println(mydb3.hashCode());
        System.out.println(mydb4.hashCode());

        MyDBConnection_5 m5=MyDBConnection_5.getInstance();
        MyDBConnection_5 m6=MyDBConnection_5.getInstance();

        System.out.println(m5==m6);
    }
}