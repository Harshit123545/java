class Cons{
    String name;
    float marks;
    int number;
    Cons(String name, float marks)
    {
        this.name=name;
        this.marks=marks;

    }
    void Display(){
        System.out.println("Hii "  + name + "" + "  qyour marks are:" + marks);
    }
}
public class parameterizedcons{
    public static void main(String[] args) {
        Cons c = new Cons("Harshit",90);
        c.Display();
        Cons c1=new Cons("Gaurav",80);
        c1.Display();
    }
}