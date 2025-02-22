class Outer{
    int outer_var = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println("Display: outer_var = " + outer_var);
        }
    }
}


public class NestedClasses {
    public static void main(String[] args) {
        Outer ob = new Outer();
        ob.test();
    }
}
