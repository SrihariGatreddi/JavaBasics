package Advanced.MultiThreading.ThreadDemo;

import Advanced.MultiThreading.Thread2;

public class DemoThread implements Runnable{
    public static void main(String[] args) {
        DemoThread obj1=new DemoThread();
        Thread thread1=new Thread(obj1);
        //thread1.run();
        thread1.start();
        thread1.setName("t1");
        System.out.println("thread "+Thread.currentThread());
        System.out.println(thread1.getName());
        try {
            thread1.join();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        Thread thread2=new Thread(()->{
            try {
                System.out.println("In thread 2 Lambda Anoynomous expression");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        System.out.println(thread2.isAlive());
        thread2.start();
        try {
            thread2.join();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(thread2.isAlive());

    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Thread "+ Thread.currentThread().getName());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
