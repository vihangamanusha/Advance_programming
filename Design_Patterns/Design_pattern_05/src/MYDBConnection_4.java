public class MYDBConnection_4 {
    private static MYDBConnection_4 mydb4;

    private MYDBConnection_4() {

    }
    public static synchronized MYDBConnection_4 getInstance() {
        if(mydb4==null){
            mydb4 = new MYDBConnection_4();
        }
        return mydb4;
    }
}
