class Average1
{
    void Display()
    {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int e=(a+b+c+d)/4;
        System.out.println("average of number is"+e);
    }
    
}
public class Average
{
    public static void main (String args[])
    {
        Average1 A=new Average1();
        A.Display();
        
    }
}