public class MyDBConnection_3 {
    private static MyDBConnection_3 mydb3;

    private MyDBConnection_3(){}

    public static MyDBConnection_3 getInstance(){
        if(mydb3 == null){
            mydb3 = new MyDBConnection_3();
        }
        return mydb3;
    }
}
