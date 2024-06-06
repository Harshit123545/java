import java.util.Arrays;
class Array{
    void Display(){
        int[] original = {1,2,3};
        int[] copy = Arrays.copyOf(original,original.length);
        System.out.println(Arrays.toString(copy));

    }
}
public class copyof{
    public static void main(String[] args) {
        Array a = new Array();
        a.Display();
    }
}