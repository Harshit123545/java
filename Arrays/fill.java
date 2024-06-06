import java.util.Arrays;
class Array{
    void Display(){
        int[] array = new int[5];
        Arrays.fill(array,1);
        for(int i : array)
        {
            System.out.println(i);
        }

    }
}
public class fill{
    public static void main(String[] args) {
        Array a = new Array();
        a.Display();
    }
}