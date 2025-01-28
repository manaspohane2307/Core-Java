class StringProgram4
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("Object Language");
		//StringBuffer object is mutable

		int pos = str.indexOf("Language");

		System.out.println(pos);

		str.insert(pos, "Oriented");
		//insert() method is only available in StringBuffer class

		//insert() method will insert before given position

		str.insert(str.indexOf("Object"), "Java is");

		System.out.println(str);

		str.setCharAt(6,'T');
		System.out.println(str);
		//setCharAt() method is only available in StringBuffer class

		//setCharAt(pos,char) method will replace character at index = pos with passed character char.

		str.append("Java is Dynamic");
		System.out.println(str);
		//append() method will insert at end of string
		//append() method is only available in StringBuffer class.

		//String s = str;
		//above line will give error : error: incompatible types: StringBuffer cannot be converted to String

		//we cant assign StringBuffer class object to String class

		String s = str.toString();
		//toString() method converts StringBuffer object to String object which is immutable.
		System.out.println(s);

	}
}
