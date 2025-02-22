class A{
    A(){
        System.out.println("I am in constructor of class A");
    }
}

class B extends A{
    B(){
        System.out.println("I am in constructor of class B");
    }
}

//First constructor of superclass gets callled and then of subclass
public class ConstructorInheritance {
    public static void main(String[] args) {
        B ob = new B();
    }
}
