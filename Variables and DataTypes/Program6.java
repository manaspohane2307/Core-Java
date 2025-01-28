class Program6{
	public static void main(String args[]){
		int a = 100;
		int b = 5555555;
		short x = (short)a;
		System.out.println(x); //output is 100
		short y = (short)b;
		System.out.println(y); //output is -15005 bcoz b is out of range of short
	}
}