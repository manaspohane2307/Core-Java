abstract class A{
    abstract void show();
}

class B extends A{
    public void show(){
        System.out.println("I am in show method");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
    }
}
