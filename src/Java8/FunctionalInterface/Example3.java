package Java8.FunctionalInterface;

/*
   Static Methods Inside Interface:
   ================================
   The Purpose of static methods is to define general utility methods.
   Interface static methods by default not available to the implementation class either by directly or using
   Implementation class name or using implementation object reference.
   We can call only through Interface name.

 */
interface inf
{
    public static void method()
    {
        System.out.println("Inside Interface Static Method");
    }
}
public class Example3 implements inf
{
    public static void main(String[] args)
    {
        inf.method();
    }
}
/*
Output:
=======
Inside Interface Static Method

 */