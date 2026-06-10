package Observer.easyobserver;

public class TeclmsDemo {
    public static void main(String[] args) {
          Teclms myTeclms = new Teclms();

          Students nimal=new Students("nimal");
          Students kamal=new Students("kamal");

          myTeclms.addObserver(nimal);
          myTeclms.addObserver(kamal);

          myTeclms.sendmessage();
    }
}
