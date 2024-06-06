class Array{
    void Display(){
        int[]arr={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of all the elements of an array:"+sum);
    }
}
public class Summation{
    public static void main(String[] args) {
        Array a = new Array();
        a.Display();
    }
}