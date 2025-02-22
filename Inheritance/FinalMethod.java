class A{
    final void show(){
        System.out.println("I am in final method of class A");
    }
}

class B extends A{
    // void show(){
    //     System.out.println("i am in show method of class B");
    // }
}


public class FinalMethod {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
    }
}
