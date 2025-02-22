class A{
    void show(){
        System.out.println("I am in show method of class A");
    }
}

class B extends A{
    void show(){
        super.show(); //super keyword is used yo call show() of class A(parent class)
        System.out.println("I am in show method of class B");
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
    }
}
