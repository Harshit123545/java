class Array
{
    void Display(){
        int a[]={1,4,5,9,45};
        int b[]={10,25,35,45,56};
        for(int i=0;i<5;i++){
            System.out.println(a[i]+b[i]);

        }
    }
}
public class Add{
    public static void main(String[] args) {
        Array a = new Array();
        a.Display();
    }
}