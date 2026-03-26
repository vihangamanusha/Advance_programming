public class MyDBConnection_1 {
    private static MyDBConnection_1 mydb1=new MyDBConnection_1();

    private MyDBConnection_1(){}

    public static MyDBConnection_1 getInstance(){
        return mydb1;
    }
}
