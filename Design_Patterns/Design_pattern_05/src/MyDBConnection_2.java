public class MyDBConnection_2 {
    private static MyDBConnection_2 mydb2;

    private MyDBConnection_2() {

    }
    static {
        try{
            if(mydb2==null){
                mydb2 = new MyDBConnection_2();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static MyDBConnection_2 getInstance() {
        return mydb2;
    }
}
