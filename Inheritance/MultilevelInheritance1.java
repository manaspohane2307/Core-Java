class A{
    void show(){
        System.out.println("I am in A");
    }
}

class B extends A{

}

class C extends B{

}

public class MultilevelInheritance1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
