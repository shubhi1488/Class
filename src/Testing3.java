interface i1
{

    public abstract void m1();

}
class one implements i1{

    @Override
    public void m1() {
        System.out.println("hello");
    }
}
public class Testing3 {
    public static void main(String[] args) {
        one obj=new one();
        obj.m1();

    }

}
