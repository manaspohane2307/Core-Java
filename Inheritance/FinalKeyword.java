class A{
    final int x = 10; //constant and can't be changed but ony accessed
}

class B extends A{
    void setx(){
        //x=50; uncommenting this line will throw error
    }

    void showx(){
        System.out.println("x="+x);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        B ob = new B();
        ob.setx();
        ob.showx();
    }
}
