abstract class Addition
{
private int a; 
private int b;
public void setAdd(int c, int d)
{
a=c;
b=d;
}
public void getAdd()
{
System.out.println(a+b);
}}
class Child extends Addition
{
void Display()
{
System.out.println("This is an excapsulation example using Abstract class");
}}

public class duplicate
{
public static void main(String args[])
{
Child c=new Child();
c.setAdd(10,20);
c.getAdd();
c.Display();
}}