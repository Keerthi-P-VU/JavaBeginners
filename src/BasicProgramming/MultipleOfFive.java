package BasicProgramming;
import java.util.*;

public class MultipleOfFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		if(n>=5 && n%5 == 0 )
		{
			System.out.println("It is multiple of 5");
		}
		else
			System.out.println("It is not a multiple of 5");

	}

}
