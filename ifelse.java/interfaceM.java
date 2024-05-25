interface A{
    abstract void method();
}
class B implements A{
    int age;
    B(int age)
    {
        this.age=age;
    }
    public void method(){
        if(age>=18)
        {
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible for vote");
        }
    }
   
}
public class interfaceM{
    public static void main(String args[]){
        B b = new B(24);
        b.method();
    }
}
