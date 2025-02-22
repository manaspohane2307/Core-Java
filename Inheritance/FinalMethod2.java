class A{
    final void show(){
        System.out.println("I am in final method of class A");
    }
}

class B extends A{
    void show(int a){ //this show() method is different from show() of superclass
        System.out.println("I am in parameterized show method of class B ");
    }
}

public class FinalMethod2 {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
        ob.show(10);
    }
}
