class Student{
    private String sname;
    private double smarks;
    public void setDetails(String n, double m){
        sname=n; smarks=m;
    }
    public void getDetails()
    {
        System.out.println("Students name and marks are "+sname+""+smarks);
    }
}
public class Main{
    public static void main (String[] args) {
        Student s = new Student();
        s.setDetails("Harsh ",56.67);
        s.getDetails();
    }

}