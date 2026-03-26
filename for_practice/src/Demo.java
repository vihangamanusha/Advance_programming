class Singleton{
    private static Singleton instance;

    private Singleton(){
        System.out.println("object created");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
public class Demo {
    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();

        System.out.println(obj1==obj2);
    }
}
