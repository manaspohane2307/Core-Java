class A{
    int a;

    A(int a1){
        a=a1;
        System.out.println("In constructor of class A");
    }

    void show(){
        System.out.println("a = " + a);
    }
}

class B extends A{
    int b;

    B(int x1,int x2){ 
        super(x1);//pass to superclass
        b=x2;
        System.out.println("In constructor of class B");
    }

    void show(){
        super.show();
        System.out.println("b = " + b);
    }
}

public class ParameterizedConstructorInheritance2 {
    public static void main(String[] args) {
        B ob = new B(100,200);
        ob.show();
    }
}
