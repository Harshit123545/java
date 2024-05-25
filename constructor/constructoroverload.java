class Cons{
    String name;
    Cons()
    {
        System.out.println("This is default constructor");
    }
    Cons(String n)
    {
        name=n;
        System.out.println(n);
    }
}
public class constructoroverload{
    public static void main(String[] args) {
        Cons c = new Cons();
        Cons c1 = new Cons("Harshit");
    }
}