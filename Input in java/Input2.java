import java.io.*;

class Input2
{
	public static void main(String args[]) //throws IOException
	{
		DataInputStream din = new DataInputStream(System.in);

		System.out.println("Enter your age: ");

		try{
				int age = Integer.parseInt(din.readLine());

				if(age > 18){
					System.out.println("Eligible for voting");
				}
				else{
					System.out.println("Not eligible for voting");
				}
			}

		catch(IOException ioe){}
	}
}

//Caught Exception