class SuperClass{ //superclass
    void show(){
        System.out.println("I am in superclass");
    }
}

class SubClass extends SuperClass{ //subclass

}

class SingleInheritance1{
    public static void main(String[] args) {
        SubClass ob = new SubClass();
        ob.show();
    }
}