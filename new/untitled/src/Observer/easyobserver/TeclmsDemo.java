package Observer.easyobserver;

public class TeclmsDemo {
      public static void main(String[] args) {
          Teclms lms=new Teclms();

          Students nimal=new Students("nimal");
          Students sam=new Students("sam");

          lms.addObserver(nimal);
          lms.addObserver(sam);

          lms.sendMessage();
      }
}
