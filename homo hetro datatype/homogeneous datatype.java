class person{
    private String name;
    private String address;
    public void setDetails(String n, String a){
        name=n;
        address=a;
    }
    public void getDetails()
    {
        System.out.println(name+" "+address);
    }
}
public class Main{
    public static void main (String[] args) {
        person p = new person();
        p.setDetails("Harshit ","london");
        p.getDetails();
    }

}