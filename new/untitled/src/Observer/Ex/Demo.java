package Observer.Ex;

public class Demo {
    public static void main(String[] args) {
        WhetherStation obj = new WhetherStation();

        Student stnimal=new Student("niamla");
        Student kamal=new Student("kamal");
        Student vihanga=new Student("vihanga");

        obj.registerObserver(stnimal);
        obj.registerObserver(kamal);
        obj.registerObserver(vihanga);

        obj.settemperture(18);

    }
}
