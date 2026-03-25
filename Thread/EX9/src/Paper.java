public class Paper {
    public synchronized void WriteWithpPaperNeedPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + ": write with pper need pen");
        pen.finish();
    }

    public synchronized void finish() {
        System.out.println(Thread.currentThread().getName() + ": finish write with pper");
    }
}
