public class ClassRoom {
    boolean ready=false;

    public synchronized void waitTeacher(){
        System.out.println("Student : wait for Teacher");
        while (!ready){
            try {
                wait(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("stating work");
        }

    }

    public synchronized void teacherArrive(){
        System.out.println("teacher : i am here");
        ready=true;
        notify();
    }
}
