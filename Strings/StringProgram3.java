import java.util.*;

class StringProgram3
{
	public static void main(String args[])
	{
		String str1 = "India is the best";
		//or String str1 = new String("India is the best");

		//substring function
		String str2 = str1.substring(9,12);
		//substring(from pos, to pos+1)

		System.out.println("str2 = " + str2);

		System.out.println(str1.substring(9,12));

		//string length
		int len = str1.length();
		System.out.println("Length of str1 is " + len);

		//print all characters of string
		//Note: string is not a character array thus str1[4] is invalid.

		System.out.println("All the characters of str1 are: ");
		for(int i=0;i<len;i++)
		{
			System.out.println("Character at " + i + " position is: " + str1.charAt(i));
		}

		//search a word within string
		String str3 = "best";
		int pos = str1.indexOf(str3);
		System.out.println("pos = " + pos);

		if(pos>0)
			System.out.println("Found");
		else
			System.out.println("Not found");



		//Convert string to uppercase
		String s1 = "Manas is studying java";
		String s2 = s1.toUpperCase();
		System.out.println(s1); //s1 does not get modified as String object is immutable.
		System.out.println(s2); //new String object s2 will be created which is upper case

		String s3 = "manas";
		s3.toUpperCase();
		System.out.println(s3); //will print "manas"


		//Compare two strings
		String s4 = "abcd";
		String s5 = "efgh";

		//if(s4.equalsIgnoreCase(s5))
		if(s4.equals(s5))
			System.out.println("Match");
		else
			System.out.println("Not match");

		System.out.println(s4.equals(s5)); //prints false

		//NOTE : equals() method is used to compare 2 string objects and not variables

		Integer a = new Integer(10);
		Integer b = new Integer(20);

		int c = 10;
		int d = 20;

		if(a.equals(b))
			System.out.println("Match");
		else
			System.out.println("Not match");

		if(c==d)
			System.out.println("Match");
		else
			System.out.println("Not match");

	}
}