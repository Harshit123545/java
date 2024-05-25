interface A{
    void simple_interest();
}

interface B extends A {
    void display();
}

class C implements B {
    int p, r, t;

    public void simple_interest() {
    
    }

    public void display(){
        
    }
}

class D extends C {
    public D(int p, int r, int t) {
        super();
        this.p = p;
        this.r = r;
        this.t = t;
        
    }
    public void display() {

        int si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

public class Extended {
    public static void main(String[] args) {
        D d = new D(10,20,30);
        d.display();
    }
}