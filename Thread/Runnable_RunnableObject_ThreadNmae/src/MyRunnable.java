class MyRunnable implements Runnable {

    public void run() {
        // Print thread name and numbers
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

