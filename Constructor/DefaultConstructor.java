class DefaultConstructor{
    public static void main(String[] args) {
        //object creation
        A ob = new A(); //default constructor will get invoked automatically
    }
}

class A{
    //default constructor
    A(){
        System.out.println("I am in default constructor A");
    }
}