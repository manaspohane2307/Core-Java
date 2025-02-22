import java.util.*;

public class VectorProgram2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Vector v = new Vector();
        // Vector V = new Vector(3);
        // Vector V = new Vector(3,2);

        System.out.println("Size of vector is: " + v.size());

        v.addElement(1); //This gives error as 1 is not object. Its primitive data. But not for this version
        //v.addElement(new Integer(1));
        
        v.addElement("Manas Pohane");//string added directly - Its valid
        v.addElement(new String("Rasika Pohane"));//also valid

        //print first element of vector
        System.out.println("First Element is " + v.firstElement());
        //print last element
        System.out.println("Last element is " + v.lastElement());

        //contains is used to search for a particular object
        if(v.contains("Manas Pohane"))
            System.out.println("Found");
        else
            System.out.println("Not found");

        //Enumerate the elements in vector
        Enumeration vEnum = v.elements();

        //print elements of vEnum
        System.out.println("Elements in vector are: ");
        while(vEnum.hasMoreElements()){
            System.out.println(vEnum.nextElement());
        }
        
    }
}
