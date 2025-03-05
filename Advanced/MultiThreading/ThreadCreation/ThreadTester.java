package Advanced.MultiThreading;

public class ThreadTester {
    public static void main(String[] args) {//main is also a user thread
        System.out.println("main is starting");
//        Thread thread1=new Thread1("thread1"); //child thread of main thread
//        thread1.start();
        //Thread thread2=new Thread(new Thread2());//
        Thread thread2=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("inside");
            }
        });
        thread2.start();
        System.out.println("main is exiting");
    }
}
