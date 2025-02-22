import java.util.*;

public class VectorProgram1 {
    public static void main(String[] args) {
        Vector v = new Vector();

        int n;
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Enter number of objects to be stored");
        n = sc.nextInt();

        //loop to store string objects in vector
        System.out.println("Enter " + n + "strings: ");
        for(int i=0;i<n;i++){
            str = sc.next();
            v.addElement(str);
        }

        //add string at a particular index
        v.insertElementAt("Manas Pohane",2);

        //method to find size of vector
        int size = v.size();

        //copy all objects from vector into string array
        String str_arr[] = new String[size];
        v.copyInto(str_arr); //copyInto() is a method of class Vector

        //print all strings from str_arr
        System.out.println("Printing all elements of str_arr String array");
        for(int i=0;i<size;i++){
            System.out.println(str_arr[i]);
        }

        sc.close();
    }
}
