class Max{
    int a,b,c;
    Max(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        if(a>b && a>c){
            System.out.println("A is Greater than B and C");
        }
        else if(b>a && b>c){
            System.out.println("B is greater than A and C");
        }
        else{
            System.out.println("C is greater than A and B");
        }

    }
}
public class larger{
    public static void main(String[] args) {
        Max m = new Max(23,34, 20);
    }

}