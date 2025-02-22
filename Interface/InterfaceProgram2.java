class Student{
    int rollnumber;

    void setNumber(int n){
        rollnumber = n;
    }

    void showNumber(){
        System.out.println("Roll Number = " + rollnumber);
    }
}

class Test extends Student{
    float part1, part2;

    void setMarks(float m1, float m2){
        part1 = m1;
        part2 = m2;
    }

    void showMarks(){
        System.out.println("Marks obrtained: ");
        System.out.println("Part1=" + part1);
        System.out.println("Part2="+ part2);
    }
}

interface Sports{
    float sportwt = 6.0f;
    void showwt(); //by default abstract
}

class Results extends Test implements Sports{
    float total;

    public void showwt(){
        System.out.println("Sports weightage= " + sportwt);
    }

    void calTotal(){
        total = part1+part2+sportwt;
    }

    void disp(){
        showNumber();
        showMarks();
        showwt();
        System.out.println("Total Marks are=" + total);
    }
}

public class InterfaceProgram2 {
    public static void main(String[] args) {
        Results student = new Results();
        student.setNumber(10);
        student.setMarks(100, 200.0f);
        student.calTotal();
        student.disp();
    }
}
