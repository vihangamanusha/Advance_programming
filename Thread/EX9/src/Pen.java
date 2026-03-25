public class Pen {
    public synchronized void WriteWithPenneedPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + ": write with pper need pen");
        paper.finish();
    }

    public synchronized void finish() {
        System.out.println(Thread.currentThread().getName() + ": finish write with pper");
    }
}
