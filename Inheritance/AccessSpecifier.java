class A{
    private int a; //private variable
    public int b; //public variable
    int c; //default variable
}

class B extends A{

}


public class AccessSpecifier {
    public static void main(String[] args) {
        B b1 = new B();
        //b1.a = 10; private variables don't get inherited
        b1.b=20;
        b1.c=30;

        System.out.println("b=" + b1.b);
        System.out.println("c=" + b1.c);
    }
}
