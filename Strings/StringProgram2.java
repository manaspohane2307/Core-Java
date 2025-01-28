import java.util.*;

class StringProgram2
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		String name;
		System.out.println("Enter your name ");
		name = S.nextLine(); //nextLine() function is in Scanner class
		System.out.println("Good evening " + name);
	}
}
