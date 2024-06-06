class A
{
    void Display(){
        int a[]={1,4,5,9,45};
        for(int i=0;i<a.length;i++){
            System.out.println("Single dimension array is"+a[i]);
        }
    }
}
public class Array{
    public static void main(String args[]){
        A a = new A();
        a.Display();
    }
}