package Advanced.MultiThreading.AdditionalMethods;


class NewThread50 implements Runnable
{
    Thread t;
    NewThread50()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("child Thread:"+""+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread interrupted");
        }
        System.out.println("Exiting child Thread");
    }
}
public class ImplementedThread
{
    public static void main(String args[])
    {
        new NewThread50();
        System.out.println("Exiting main Thread");
    }
}
