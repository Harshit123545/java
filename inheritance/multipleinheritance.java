interface character{
    abstract void attack();
}
interface weapon{
    abstract void use();
}
class Warrior implements character,weapon{
    public void attack(){
        System.out.println("warrior attacks with a sword.");
    }
    public void use(){
        System.out.println("warrior uses a sword.");
    }
}
public class multipleinheritance
{
    public static void main(String args[]){
        Warrior w = new Warrior();
        w.attack();
        w.use();
    }
}