class Array{
    void Display(){
        int[] arr = {25,11,7,75,56};
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element present in given array:"+min);

    }
}
public class Minimum {
    public static void main(String[] args) {
        Array a = new Array();
        a.Display();
    }
}