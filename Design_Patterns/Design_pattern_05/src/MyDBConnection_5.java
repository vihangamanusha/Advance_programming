public class MyDBConnection_5 {
    private static MyDBConnection_5 mydb5;

    private MyDBConnection_5() {

    }
    private static class MYDBConnection_5Instance {
        private static final MyDBConnection_5 mydb5 = new MyDBConnection_5();
    }
    public static MyDBConnection_5 getInstance() {
        return MYDBConnection_5Instance.mydb5;
    }
}
