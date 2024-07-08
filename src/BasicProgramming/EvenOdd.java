package BasicProgramming;
import java.util.*;

public class EvenOdd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		if(n%2 == 0 )
		{
			System.out.println("It is even number");
		}
		else
			System.out.println("It is odd number");
	}
}
