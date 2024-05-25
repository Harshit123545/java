class Addition{
    void add()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Addition of two number is"+c);
        
    }

}
class Substraction extends Addition{
    void sub()
    {
        int d=a-b;
        System.out.println("substraction of twp number is"+d);
    }
}
class Multiplication extends substraction{
    void mul()
    {
        int e=a*b;
        System.out.println("multiplication of two number is"+e);
    }
}
class Modulus extends multiplication{
    void mod()
    {
        int f=a%b;
        System.out.println("Modulus of two number is"+f);
    }
}
class Division extends multiplication{
    void div()
    {
        int g=a/b;
        System.out.println("division of two number is"+g);
    }
}
public class main{
    class public static void main (String args[]) {
        Modulus m1 = new Modulus();
        m1.Addition();
        m1.substraction();
        m1.multiplication();
        
        division d1 = new division();
        d1.Addition();
        d1.substraction();
        d1.multiplication();
    }
    
}