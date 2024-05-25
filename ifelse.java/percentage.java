class student{
    int a,b,c,d,e,per;
    student(int a,int b,int c,int d,int e){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        per=(a+b+c+d+e)/5;
        System.out.println(per);
        if(per>=90 && per<100){
            System.out.println("you are a brilliant student");
        }
        else if(per>=80 && per<90){
            System.out.println("you are a very good student");
        }
        else if(per>=70 && per<80){
            System.out.println("you are a good student");
        }
        else{
            System.out.println("you are a worst student , bloody idiot");
        }
    }
}
public class percentage{
    public static void main(String[] args) {
        student s = new student(27, 9, 20, 20, 20);
    }
}
      