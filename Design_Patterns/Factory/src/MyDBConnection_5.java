public class MyDBConnection_5 {
    private static MyDBConnection_5 mydb5;

    private MyDBConnection_5(){}

    private static class MyDBConnection_5instance{
        private static final MyDBConnection_5 mydb5 = new MyDBConnection_5();
    }

    public static MyDBConnection_5 getInstance(){
        return MyDBConnection_5instance.mydb5;
    }
}
