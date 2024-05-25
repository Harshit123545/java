interface A
{
    abstract void Display();
}
class Child implements A
{
    private int a1;
    private int a2;
    public void setValue(int a1,int a2)
    {
        this.a1=a1;
        this.a2=a2;
    }
    public void getValue()
    {
        System.out.println("Addition is"+(a1+a2));
    }
    public void Display()
    {
        System.out.println("This is example of encapsulation using interface");
    }
    
}
public class Main{
    public static void main(String args[]){
        Child c = new Child();
        c.Display();
        c.setValue(10,23);
        c.getValue();
    }
}