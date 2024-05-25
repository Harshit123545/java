class Base{
    Base(){
        System.out.println("This is base class constructor");
    }
}
class child extends Base
{
    child()
    {
        System.out.println("This is class class Constructor");
    }
}
public class inheritanceconstructor{
    public static void main(String[] args) {
        child c=new child();
    }
}