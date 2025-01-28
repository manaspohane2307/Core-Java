import java.lang.Math;

class Program22{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int p = (int)Math.pow(a,b);//returns double thus typecasted to int
		System.out.println(a + " to the power " + b + " is " + p);
	}
}
