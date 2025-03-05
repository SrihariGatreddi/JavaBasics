package Advanced.MultiThreading.ThreadCreation;

import java.util.Random;
public class RandomVar
{
    public static void main(String[] args) {
        printVar p1 = new printVar();
        Thread t1 = new Thread(new printVar());
        t1.start();
    }
}
 class printVar extends Random implements Runnable
{
    int n1;
    Random r1 = new Random();
    @Override
    public void run() {
        int count=0;
        int count1=0;
        int count2=0;
        for (int i = 0; i <= 10; i++) {
            n1 = r1.nextInt(1001) - 500;
            System.out.println(n1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (n1 > 0 && n1 % 2 == 0) {
                synchronized (this) {
                    count++;
                }
            } else if (n1 > 0) {
                synchronized (this) {
                    count1++;
                }
            } else if (n1 < 0) {
                synchronized (this) {
                    count2++;
                }
            }
        }
        System.out.println("Negative odd numbers are: "+count2);
        System.out.println("Positive Even numbers are: "+count);
        System.out.println("Positive Odd numbers are: "+count1);
    }
}

