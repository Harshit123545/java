class Demo{
    int a=3,b=4,c=5;
    void Display(){
        if(a==3){
            System.out.println("A is equal to 3");
        }
        else{
            System.out.println("A is not equal to 3");
        }
        if(a!=4 && b>=4){
            System.out.println("B is equal to 4");
        }
        else{
            System.out.println("A is not equal to 4");
        }
        if(c>=4 && b<=4){
            System.out.println("c is greater than 4");
        }
        else{
            System.out.println("b is smaller than 4");
        }
        if(b!=4){
            System.out.println("b is invalid");
        }
        else{
            System.out.println("it is valid");
        }
        if(c!=5){
            System.out.println("c is in valid");
        }
        else{
            System.out.println("c is valid");
        }
    }
}
public class condition{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.Display();
    }
}