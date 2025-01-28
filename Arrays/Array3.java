import java.util.*;

class Array3
{
	public static void main(String args[])
	{
		int a[][] = new int[3][3];
		int i,j;

		Scanner sc = new Scanner(System.in);

		//input 2d array elements
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("Enter element: ");
				a[i][j] = sc.nextInt();
			}
		}

		//print 2d array elements
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}