/*Anonymous nested class
abstract
interface
if you don't know the behaviour declare method with abstract modifier
if a class is having abstract method then it is mandatory to create the class with abstract modifier.
concept of inheritence
 */
 abstract class Result{
    abstract public void calculateResult();//abstract method

}
class Second extends Result//child class which is inheriting the result class
{
    public void calculateResult()
    {
        System.out.println("Welcome");

    }
}
public class TestAnonymousclass {
    public static void main(String[] args) {
        Second obj=new Second();
        obj.calculateResult();
    }

}
