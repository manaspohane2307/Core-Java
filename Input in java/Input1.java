import java.io.*;

class Input1
{
	public static void main(String args[]) //throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try{
			System.out.println("Enter your age: ");
			int age = Integer.parseInt(br.readLine());

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
//Caught Exception - must have try catch block or throws


