public class MyDBConnecyion_3 {
    private static MyDBConnecyion_3 mydb3;

    private MyDBConnecyion_3(){

    }
    public static MyDBConnecyion_3 getInstance(){
        if(mydb3==null){
            mydb3 = new MyDBConnecyion_3();
        }
        return mydb3;
    }
}
