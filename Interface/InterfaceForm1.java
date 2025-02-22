interface A{
    static final int var_A = 10;
    abstract void fun_A();
}

class B implements A{
    public void fun_A(){
        System.out.println("Overriding fun_A method");
    }
}

class C extends B{
    // System.out.println("No need to override fun_A");
    //If we directly write System.out.println() in class then it will give error.
    //sout must be written inside a method
}

public class InterfaceForm1 {
    public static void main(String[] args) {
        C ob = new C();
        ob.fun_A();
    }
}
