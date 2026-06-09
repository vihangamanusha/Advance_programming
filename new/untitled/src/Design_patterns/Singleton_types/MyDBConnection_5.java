package Design_patterns.Singleton_types;

public class MyDBConnection_5 {

    private static MyDBConnection_5 mydb5;

    private MyDBConnection_5(){}

    private static class MyDBConnectioninstance{
        private static final MyDBConnection_5 INSTANCE = new MyDBConnection_5();
    }

    public static MyDBConnection_5 getInstance(){
        return MyDBConnection_5.mydb5;
    }
}
