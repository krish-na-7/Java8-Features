package Java8.FunctionalInterface;

/*
        Interface Static Method Overriding:
        ===================================
        Overriding concept is not applicable for interface static methods.
        If we want we can declare same exact method in implementing class it is valid but not overriding.
 */
interface statinf
{
    public static void method()
    {
        System.out.println("Inside Interface Static Method");
    }
}

public class Example4 implements statinf
{
    public static void method()
    {
        System.out.println("Inside Child Class Static Method");
    }

    public static void main(String[] args)
    {
        statinf.method(); // => Inside Interface Static Method

        Example4.method(); // => Inside Child Class Static Method
    }
}
/*
Output:
=======
Inside Interface Static Method
Inside Child Class Static Method

 */
