package assignment3;
import java.util.Scanner;
public class Biggest_Number {
	public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("First number:");
        x = s.nextInt();
        System.out.print("Second number:");
        y = s.nextInt();
        System.out.print("Third number:");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number:"+y);
        }
        else
        {
            System.out.println("Largest number:"+z);
        }
 
    }

}
