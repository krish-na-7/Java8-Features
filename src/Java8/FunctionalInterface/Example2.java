package Java8.FunctionalInterface;

// Default Method Inside Interface

interface inter1
{
    default void method()
    {
        System.out.println("Inside Interface Default Method");
    }
}
public class Example2 implements inter1
{
     public static void main(String[] args)
     {
         Example2 example2 = new Example2();
         example2.method();
     }
}

/*
Output:
=======
Inside Interface Default Method

 */