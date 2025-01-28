class Program20{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		float s = Math.sqrt(n); //sqrt function returns double value thus can't store it in float.
		System.out.println(s);
	}
}

/*

 error: incompatible types: possible lossy conversion from double to float
		float s = Math.sqrt(n);
		                   ^
*/

