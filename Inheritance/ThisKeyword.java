class A{
    int x;
    static int y;

    void set(int x){
        this.x = x;//this represent the object through which set method is called
    }

    void display(){
        System.out.println("x="+x);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        A ob = new A();
        ob.set(100);
        ob.display();
    }
}
