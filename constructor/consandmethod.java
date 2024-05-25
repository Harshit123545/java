class Cons{
    int a=10, b=20, c=50, d=35, e;
    Cons()
    {
        e=(a+b+c+d)/4;
    }
    void Display()
    {
        System.out.println("percentage is"+e+"%");
    }
}
public class consandmethod{
    public static void main(String args[])
    {
        Cons c=new Cons();
        c.Display();
    }
}