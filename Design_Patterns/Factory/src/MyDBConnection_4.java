public class MyDBConnection_4 {
    private static MyDBConnection_4 mydb4;

    private MyDBConnection_4(){

    }

    public static synchronized MyDBConnection_4 getInstance(){
        if(mydb4 == null){
            mydb4 = new MyDBConnection_4();
        }
        return mydb4;
    }
}
