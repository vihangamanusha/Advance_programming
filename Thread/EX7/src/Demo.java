public class Demo {
    public static void main(String[] args) {
        ClassRoom room = new ClassRoom();

        Thread teacher=new Thread(()->room.waitTeacher());

        Thread student=new Thread(()-> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            room.teacherArrive();
        });

        teacher.start();
        student.start();
    }
}
