interface D{
    static final int var_d = 10;
    abstract void fun_D();
}

interface E extends D{
    static final int var_E = 20;
    abstract void fun_E();
}

class A{
    int var_a = 30;
    void showa(){
        System.out.println("var_a="+var_a);
    }
}

class B extends A{
    int var_b = 40;
    void showb(){
        System.out.println("var_b="+var_b);
    }
}

class C extends B implements E{
    public void fun_E(){//overriding abstract method of interface E
        System.out.println("Overriding method of interface E");
    }

    public void fun_D(){//overriding abstract method of interface D
        System.out.println("Overriding method of interface D");
    }
}

public class InterfaceForm2 {
    public static void main(String[] args) {
        C ob = new C();
        ob.fun_D();
        ob.fun_E();
        ob.showa();
        ob.showb();
    }
}
