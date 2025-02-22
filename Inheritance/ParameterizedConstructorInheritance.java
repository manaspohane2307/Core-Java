class A{
    int a;

    A(int a1){
        a = a1;
        System.out.println("I am in constructor of class A");
    }

    void show(){
        System.out.println("a= "+ a);
    }
}

class B extends A{
    B(int x){
        super(x);//super constructor - used to pass value to superclass constructor
        System.out.println("I am in constructor of class B");
    }
}

public class ParameterizedConstructorInheritance {
    public static void main(String[] args) {
        B ob = new B(100);
        ob.show(); //accessing show() method of superclass
    }
}
