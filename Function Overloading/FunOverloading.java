class FunOverloading{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setData();
        p2.setData("Manas", 20);
        p3.setData(p2);

        System.out.println("p1 information: ");
        p1.showData();
        System.out.println("p2 information: ");
        p2.showData();
        System.out.println("p3 information: ");
        p3.showData();
    }
}

class Person{
    String name;
    int age;

    void setData(){ //without arguments
        name=null;
        age=0;
    }

    void setData(String n, int a){ //2 arguments - one string and other integer
        name=n;
        age=a;
    }

    void setData(Person ob){ //object as an argument
        name = ob.name;
        age = ob.age;
    }

    void showData(){ //method to print name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
