package Java8.FunctionalInterface;

/*
    Functional Interface:
    =====================
    An interface contain single abstract method is called Functional Interface.

    Runnable => contains only one abstract method i.e, run() method.
    Callable => contains only one abstract method i.e, call() method.
    ActionListener => contains only one abstract method i.e, actionPerformed() method.
    Comparable => contains only one abstract method i.e, compareTo() method.

    Functional Interface are used to call or invoke the Lambda Expression.
    @FunctionalInterface annotation is used to declare explicitly an interface as Functional Interface.

    Functional Interface can contain any number of default and static methods.
    It contains exactly one abstract method (SAM - Single Abstract Method)

    Every method present in interface is public and abstract, variables are public,static and final.
    But from 1.8 version onwards we can declare default methods inside interface.


 */
// Default Methods Inside Interface with Multiple Inheritance Concept
interface inf1
{
    default void method1()
    {
        System.out.println("Inside Interface 1 Default Method");
    }
}
interface inf2
{
    default void method1()
    {
        System.out.println("Inside Interface 2 Default Method");
    }
}
public class Example1 implements inf1,inf2
{
    @Override
    public void method1()
    {
        System.out.println("Our own Implementation");
        inf1.super.method1();  // => Inside Interface 1 Default Method
        // inf2.super.method1();  => Inside Interface 1 Default Method
    }
     public static void main(String[] args)
     {
         Example1 example1 = new Example1();
         example1.method1();
     }
}
/*
Output:
=======
Our own Implementation
Inside Interface 1 Default Method

 */