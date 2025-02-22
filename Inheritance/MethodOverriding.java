class A{
    void show(){
        System.out.println("I am in show method of class A");
    }
}

class B extends A{
    void show(){ //method overriding
        System.out.println("I am in show method of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B ob = new B();
        ob.show(); //subclass's show() method will be called
    }
}
