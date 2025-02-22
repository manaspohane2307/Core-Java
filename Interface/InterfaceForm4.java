interface A{
    static final int var_A = 10;
    abstract void fun_A();
}

interface B{
    static final int var_B = 20;
    abstract void fun_B();
}

interface C extends A,B{
    static final int var_C = 30;
    abstract void fun_C();
}

class D implements C{
    //need to override or implement all abstract methods of all interfaces
    public void fun_C(){
        System.out.println("Implementing abstract method of interface C");
    }

    public void fun_B(){
        System.out.println("Implementing abstract method of interface B");
    }

    public void fun_A(){
        System.out.println("Implementing abstract method of interface A");
    }
}
public class InterfaceForm4 {
    public static void main(String[] args) {
        D ob = new D();
        ob.fun_C();
        ob.fun_B();
        ob.fun_A();
    }
}
