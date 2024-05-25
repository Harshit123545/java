class Celcius1
{
    void Cel()
    {
        float f=30;
        float c=(f-32)*5/9;
        System.out.println("The relation between celcius and farenheit is"+c);
    }
    
}
public class celcius
{
    public static void main (String args[])
    {
        Celcius1 C=new Celcius1();
        C.Cel();
        
    }
}