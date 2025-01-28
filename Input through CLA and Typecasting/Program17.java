class Program17{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		//float div = 1.0f*a/b;
		float div = (float)1.0*a/b;
		//float div = (float)(a/b); will give result 0.0

		System.out.println("Division is :" + div);
	}
}
