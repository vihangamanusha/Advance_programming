public class Deadlock {
    public static void main(String[] args) {
        Paper paper = new Paper();
        Pen pen = new Pen();

        Thread t1=new Thread(new Kamal(paper,pen), "Kamal");
        Thread t2=new Thread(new Kamal(paper,pen), "Kamal");
        t1.start();
        t2.start();
    }
}
