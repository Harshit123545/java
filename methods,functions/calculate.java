class Calculate1
{
    void Addition()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("sum of two number is"+c);
    }
    void Multiplication()
    {
        int d=20;
        int e=20;
        int f=d*e;
        System.out.println("multiplication of two number is"+f);
    }
    void substraction()
    {
        int g=30;
        int h=40;
        int i=g-h;
        System.out.println("substraction of two number is"+i);
        
    }
    
}
public class calculate
{
    public static void main (String args[])
    {
        Calculate1 C=new Calculate1();
        C. Addition();
        C.Multiplication();
        C.substraction();
    }
}