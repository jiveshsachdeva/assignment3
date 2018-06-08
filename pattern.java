package assignment3;

import java.util.Scanner;

public class pattern {
	public static void pattern1()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern1();
	}

}
