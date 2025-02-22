public class CopyConstructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("manas",20);
        Person p3 = new Person(p2);

        System.out.println("p1 information:");
        p1.showData();
        System.out.println("p2 information:");
        p2.showData();
        System.out.println("p3 information");
        p3.showData();
    }
}

class Person{
    String name;
    int age;

    Person(){ //Default constructor
        name=null;
        age=0;
    }

    Person(String n, int a){ //parameterized constructor
        name=n;
        age=a;
    }

    Person(Person ob){ //object is passed in constructor
        name = ob.name;
        age = ob.age;
    }

    void showData(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
    }
}
