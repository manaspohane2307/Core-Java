interface A{
    static final int var_a = 10;
    abstract void fun_A();
}

class B implements A{
    public void fun_A(){
        System.out.println("Implementing fun_A method of interface A in class B");
    }
}

class C implements A{
    public void fun_A(){
        System.out.println("Implementing fun_A method of interface A in class C");
    }
}

public class InterfaceForm3 {
    public static void main(String[] args) {
        B ob1 = new B();
        ob1.fun_A();
        C ob2 = new C();
        ob2.fun_A();
    }
}
