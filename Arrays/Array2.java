import java.io.*;
import java.util.*;


class Array2
{
	public static void main(String args[]) throws IOException
	{
		int a[]; //declaration

		DataInputStream din = new DataInputStream(System.in);

		System.out.println("Enter size of array: ");
		int n = Integer.parseInt(din.readLine());

		a = new int[n]; //initialization

		//accept elements in array
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element: ");
			a[i] = Integer.parseInt(din.readLine());
		}

		//print elements
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}

		System.out.println(); //move cursor to next line

		//sort array using sort() method of Arrays class
		Arrays.sort(a); // sort() method is static method

		System.out.println("Array elements after sorting are: ");

		//print elements after sorting
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}

	}
}

