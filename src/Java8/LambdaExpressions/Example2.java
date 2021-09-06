package Java8.LambdaExpressions;
/*
      Example of Lambda Expression in Threads
 */
public class Example2
{
    public static void main(String[] args)
    {
        Runnable r = () -> {
            for(int i=0;i<10;i++)
            {
                System.out.println("In Child Thread");
            }
        };
        Thread th = new Thread(r);
        th.start();

        for(int i=0;i<10;i++)
        {
            System.out.println("In Main Thread");
        }
    }
}