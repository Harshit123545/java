interface Parent{
    abstract void Display(int age);
}
class B implements Parent
{
    int age;
    public void Display(int age){
        this.age=age;
        if(age>=18){
            System.out.println("your age is greater than 18");
        }
        else{
            System.out.println("your age is less than 18");
        }
    }

}
public class interfacePara{
    public static void main(String[] args) {
        B b = new B();
        b.Display(23);
    }
}