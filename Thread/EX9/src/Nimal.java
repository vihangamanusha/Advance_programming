public class Nimal implements Runnable {
    Paper paper;
    Pen pen;

    public Nimal(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    public void run() {
        synchronized (paper) {
            pen.WriteWithPenneedPaper(paper);
        }
    }

}
