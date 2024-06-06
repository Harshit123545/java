class Array{
    void Display(){
        int[] arr = {25,11,7,75,56};
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element present in given array:"+max);

    }
}
public class Maximum {
    public static void main(String[] args) {
        Array a = new Array();
        a.Display();
    }
}