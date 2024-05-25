class Base{
    String name;
    Base(){
        System.out.println("This is base class Constructor");
    }
    Base(String name){
        this.name=name;
    }
}
class child extends Base{
    child()
    {
        System.out.println("This is child class constructor");
    }
    child(String name){
        super(name);
        System.out.println(name);
    }
}
public class superkey{
    public static void main(String[] args) {
        child c=new child();
        child c1=new child("java");
    }
}