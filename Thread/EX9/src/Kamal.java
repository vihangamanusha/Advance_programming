public class Kamal implements Runnable {
    Paper paper;
    Pen pen;

    public Kamal(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    public void run() {
        synchronized (pen) {
            paper.WriteWithpPaperNeedPen(pen);
        }
    }
}
