package assignment3;

import java.util.Scanner;
public class leapyear {

	public static boolean leap_year()
	{
		int n;
		Scanner sc=new  Scanner(System.in);
		System.out.print("Enter year");
		n=sc.nextInt();
		if(n%100==0)
		{
			if(n%400==0)
			{
				return true;
			}
			else
				return false;
		}
		else if(n%4==0)
			return true;
		else
			return false;			
	}
			
	public static void main(String[] args) {
		boolean checker;
		checker=leap_year();
		if(checker)
		System.out.print("Leap year");
		else
			System.out.print("Not a leap year");
			
			
	}

}
