package BasicProgramming;
import java.util.*;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		if(n > 0)
			System.out.println("It is a positive number");
		else if(n < 0)
			System.out.println("It is a negative number");
		else
			System.out.println("Zero is neither positive nor negative");
	}

}
