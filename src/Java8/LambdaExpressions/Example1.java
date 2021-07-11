package Java8.LambdaExpressions;

/*
      Lambda expression is an anonymous expression without having name, modifiers and return type.


      To enable functional programming in java.
      write more readable, maintainable  and concise code.
      To use API very easily and effectively.
      To enable parallel programming.

      Properties and characteristics of Lambda Expression:
      1. A Lambda expression can take any no.of parameters.
          (a,b) -> System.out.println(a+b);
      2. If multiple parameters are present then these parameters should be separated with comma(",").
          (a,b,c) -> System.out.println(a+b*c);
      3. If only one parameter is available then parenthesis are Optional.
          s -> s.length();
      4. Usually we can specify the type of parameter if compiler expect the type based on context, then
         we can remove type [Type Inference].
      5. Similar to method body, Lambda expression body can contain any number of statements.
         If multiple statements are present then we should enclose within curly braces "{}".
         () -> {
                 statement1;
                 statement2;
                 statement3;
               }
         If only one statement present then curly braces are optional.
         () -> System.out.println(s);
      6. If Lambda Expression return something then we can remove return keyword.
         s -> return s.length();  =>  s-> s.length();


 */
@FunctionalInterface
interface AddService
{
    int add(int a,int b);
}
public class Example1 {
    public static void main(String[] args){
        AddService c = (a,b) ->  a+b;
        System.out.println(c.add(2,3));
    }
}

