package assignment3;

import java.util.Scanner;

public class addition_of_numbers {
	public static int add(int x,int y)
	{
		int c=x+y;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("First No:");
		a=sc.nextInt();
		
		System.out.print("Second No:");
		b=sc.nextInt();
		
		int sum=add(a,b);
		System.out.print("Sum :"+sum);
		
	}

}
