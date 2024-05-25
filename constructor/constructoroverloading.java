class Cons{
    String name, course; int id;
    Cons(){
        System.out.println("This is default constructor");
    }
    Cons(String n,String c){
        name = n;
        course = c;
        System.out.println(n + c);
    }
    Cons(int id)
    {
        this.id=id;
        System.out.println(id);
    }
}
public class constructoroverloading{
    public static void main(String[] args) {
        Cons c = new Cons();
        Cons c1 = new Cons("Harshit ", "MCA");
        Cons c2 = new Cons(123);
    }
}
