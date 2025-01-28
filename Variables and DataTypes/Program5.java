class Program5{
	public static void main(String args[]){
		int a;
		float b = 6.5; //double ko float mein store kar rahe toh error ayega
		a = b; //float ko int mein store kar rahe toh error ayega
		System.out.println(b);
		System.out.println(a);
	}
}

/*
2 errors:

error: incompatible types: possible lossy conversion from double to float.
float b = 6.5;

error: incompatible types: possible lossy conversion from float to int
		a = b;
*/