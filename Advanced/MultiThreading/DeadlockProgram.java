package Advanced.MultiThreading;

public class DeadlockProgram {
    public static void main(String[] args) throws InterruptedException {


    String lock1 ="sri";
    String lock2= "hari";
    Thread thread1= new Thread(() -> {
        synchronized(lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace(); }
            synchronized(lock2) {
                System.out.println("lock acquired");
            }
        }
    }, "thread1");
    Thread thread2= new Thread(() -> {
        synchronized(lock2) {
            try {
                Thread.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            synchronized (lock1) {
                System.out.println("lock acquired");
            }
        }
    },"thread2");

    thread1.start();
    thread2.start();
//    thread1.join();
//    thread2.join();
        System.out.println("in main");
}
}
