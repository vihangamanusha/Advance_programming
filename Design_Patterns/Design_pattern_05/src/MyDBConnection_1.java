public class MyDBConnection_1 {
    private static MyDBConnection_1 MyDb=new MyDBConnection_1();

    public MyDBConnection_1() {

    }

    public static MyDBConnection_1 getInstance() {
        return MyDb;
    }
}
